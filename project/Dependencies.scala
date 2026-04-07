import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"         % "0.53.0",
    "com.typesafe.play"   %% "play-ahc-ws-standalone" % "2.2.11",
    "com.typesafe.play"   %% "play-json"              % "2.10.6",
    "org.mongodb.scala"   %% "mongo-scala-driver"     % "5.1.0" cross CrossVersion.for3Use2_13
  ).map(_ % Test)

}
