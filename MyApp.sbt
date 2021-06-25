version := "0.0.1snap"
scalaVersion := "2.13.6"
libraryDependencies += scalaOrganization.value % "scala-reflect" % scalaVersion.value
Compile/scalaSource := baseDirectory.value / "src"
Compile/unmanagedResourceDirectories := List(baseDirectory.value / "res")
libraryDependencies += "org.openjfx" % "javafx-controls" % "15.0.1"