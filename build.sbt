import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.5",
      version      := "0.3.0"
    )),
    name := "HackerRankFP",
    libraryDependencies += scalaTest % Test
  )
