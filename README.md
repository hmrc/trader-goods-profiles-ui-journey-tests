**This is the template README. Please update this with project specific content.**

# trader-goods-profiles-ui-journey-tests

<SERVICE_NAME> UI journey tests.

## Pre-requisites

### Services

Start Mongo Docker container as follows:

```bash
docker run --rm -d -p 27017:27017 --name mongo percona/percona-server-mongodb:5.0
```

Start `<SERVICE_MANAGER_PROFILE>` services as follows:

```bash
sm2 --start <SERVICE_MANAGER_PROFILE>
```

### Docker Selenium Grid

Confirm that [docker-selenium-grid](https://github.com/hmrc/docker-selenium-grid) is up-to-date and follow the provided [instructions](https://github.com/hmrc/docker-selenium-grid/blob/main/README.md).

## Tests

Run tests as follows:

* Argument `<browser>` must be `chrome`, `edge`, or `firefox`.
* Argument `<environment>` must be `local`, `dev`, `qa` or `staging`.

```bash
./run-tests.sh <browser> <environment>
```

## Scalafmt

Check all project files are formatted as expected as follows:

```bash
sbt scalafmtCheckAll scalafmtCheck
```

Format `*.sbt` and `project/*.scala` files as follows:

```bash
sbt scalafmtSbt
```

Format all project files as follows:

```bash
sbt scalafmtAll
```

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
