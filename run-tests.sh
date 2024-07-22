#!/bin/bash -e
DEFAULT_BROWSER=chrome
BROWSER_TYPE=$1
ENV=$2

if [ -z "$BROWSER_TYPE" ]; then
    echo "BROWSER_TYPE value not set, defaulting to $DEFAULT_BROWSER..."
    echo ""
fi

is_mongo_cmd_available() {
  command -v mongo &> /dev/null;
}

is_mongosh_cmd_available() {
  command -v mongosh &> /dev/null;
}

if is_mongosh_cmd_available; then
    echo "Using mongosh";
    mongosh --eval "load('mongo-db-setup.js')";
elif is_mongo_cmd_available; then
    echo "Using mongo";
    mongo --eval "load('mongo-db-setup.js')";
else
    echo "No mongo/mongosh available";
    exit 1;
fi

sbt -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Denvironment="${ENV:=local}" -Dbrowser.option.headless=false -Daccessibility.assessment="false" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TestRunner" testReport
