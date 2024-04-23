lazy val root = (project in file("."))
  .settings(
    name := "trader-goods-profiles-ui-journey-tests",
    version := "0.1.0",
    scalaVersion := "2.13.12",
    libraryDependencies ++= Dependencies.test,
    // The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
    Test / testOptions := Seq.empty
  )

