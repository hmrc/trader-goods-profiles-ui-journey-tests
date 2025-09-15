import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"         % "0.49.0",
    "io.cucumber"         %% "cucumber-scala"         % "8.26.1",
    "io.cucumber"          % "cucumber-junit"         % "7.21.1",
    "junit"                % "junit"                  % "4.13.2",
    "com.novocode"         % "junit-interface"        % "0.11",
    "com.typesafe.play"   %% "play-ahc-ws-standalone" % "2.2.11",
    "com.typesafe.play"   %% "play-json"              % "2.10.6",
    "org.mongodb.scala"   %% "mongo-scala-driver"     % "5.1.0" cross CrossVersion.for3Use2_13
  ).map(_ % Test)

}
