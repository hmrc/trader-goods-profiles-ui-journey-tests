#!/bin/bash -e
DEFAULT_BROWSER=chrome
BROWSER_TYPE=$1
ENV=$2
HEADLESS=$3

if [ -z "$BROWSER_TYPE" ]; then
    echo "BROWSER_TYPE value not set, defaulting to $DEFAULT_BROWSER..."
    echo ""
fi

sbt -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Denvironment="${ENV:=local}" -Dbrowser.option.headless="${HEADLESS:=false}" -Daccessibility.assessment="true" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TestRunner" testReport
