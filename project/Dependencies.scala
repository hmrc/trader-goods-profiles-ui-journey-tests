import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "com.vladsch.flexmark" % "flexmark-all"    % "0.64.8" % Test,
    "org.scalatest"       %% "scalatest"       % "3.2.18" % Test,
    "org.slf4j"            % "slf4j-simple"    % "2.0.9"  % Test,
    "uk.gov.hmrc"         %% "ui-test-runner"  % "0.19.0" % Test,
    "io.cucumber"          % "cucumber-junit"  % "7.16.1" % Test,
    "io.cucumber"         %% "cucumber-scala"  % "8.21.1" % Test,
    "com.github.sbt"       % "junit-interface" % "0.13.3" % Test
  )

}
