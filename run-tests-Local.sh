#!/bin/bash -e
DEFAULT_BROWSER=chrome
BROWSER_TYPE=$1
ENV=$2

if [ -z "$BROWSER_TYPE" ]; then
    echo "BROWSER_TYPE value not set, defaulting to $DEFAULT_BROWSER..."
    echo ""
fi

# Scalafmt checks have been separated from the test command to avoid OutOfMemoryError in Jenkins
sbt scalafmtSbt
sbt scalafmtAll
sbt scalafmtCheckAll scalafmtSbtCheck


sbt -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Denvironment="${ENV:=local}" -Dbrowser.option.headless=false -Daccessibility.assessment="false" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TestRunnerLocal" testReport
