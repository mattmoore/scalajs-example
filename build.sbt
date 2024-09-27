ThisBuild / scalaVersion := "3.5.1"

lazy val root = (project in file("."))
  .aggregate(app)

lazy val app = (project in file("app"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(
    name                            := "scalajs-example",
    scalaJSUseMainModuleInitializer := true,
    Compile / mainClass             := Some("app.Main"),
    Compile / npmDependencies ++= Seq(
      "@datadog/datadog-api-client" -> "1.28.0",
      "uuid"                        -> "10.0.0",
    ),
    webpackBundlingMode := BundlingMode.Application,
  )
