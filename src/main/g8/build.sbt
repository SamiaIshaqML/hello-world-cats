import Dependencies._

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    scalaVersion := "3.3.1",
    libraryDependencies += munit % Test,
    // Latest stable Scala 3 version
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"
  )
