ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "homebrew-brew-test",
    libraryDependencies ++= Seq()
  )

assembly / mainClass := Some("com.example.Main")