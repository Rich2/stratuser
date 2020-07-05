scalaVersion := "2.13.3"
libraryDependencies += scalaOrganization.value % "scala-reflect" % scalaVersion.value
Compile/scalaSource := baseDirectory.value / "src"
Compile/unmanagedResourceDirectories := List(baseDirectory.value / "res")
