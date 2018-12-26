import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.8",
      version      := "0.3.0"
    )),
    name := "HackerRankFP",
    libraryDependencies += scalaTest % Test
  )
