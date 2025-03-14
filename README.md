# Trader Goods Profiles

Trader Goods Profiles (TGP) supports UK Internal Market Scheme (UKIMS) registered traders moving goods from Great Britain to Northern Ireland that are not-at-risk of moving into the European Union.

TGP stores goods information allowing traders or intermediaries to use the information to create, update and remove declarations.

# trader-goods-profiles-ui-journey-tests

This repo contains the UI journey tests for the [Trader Goods Profiles Frontend](https://github.com/hmrc/trader-goods-profiles-frontend).

## Pre-requisites

### Services

Start Mongo Docker container as follows:

```bash
docker run --rm -d -p 27017:27017 --name mongo percona/percona-server-mongodb:5.0
```

Start `TGP_FE>` services as follows:

```bash
sm2 --update-config
sm2 --start TGP_FE_ALL
```

## Tests

Run tests as follows:

* Argument `<browser>` must be `chrome`, `edge`, or `firefox`.
* Argument `<environment>` must be `local`, `dev`, `qa` or `staging`.
* Argument `<headless>` must be `false`, or `true`.

```bash
./run-tests.sh <browser> <environment> <headless>
```

Basic Command to run the tests locally with the UI shown
```bash
./run-tests.sh chrome local false
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
