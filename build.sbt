libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value % Provided

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.11"

name := "XmlExtractor"

organization in ThisBuild := "com.thoughtworks.binding"
