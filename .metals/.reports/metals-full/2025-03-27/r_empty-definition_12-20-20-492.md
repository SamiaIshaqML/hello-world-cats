error id: `<none>`.
file://<WORKSPACE>/src/main/g8/build.sbt
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 157
uri: file://<WORKSPACE>/src/main/g8/build.sbt
text:
```scala
import Dependencies._

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "\$name\$",
    version := "\$ver@@sion\$",
    scalaVersion := "3.3.1",
      libraryDependencies += munit % Test,
 // Latest stable Scala 3 version
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.