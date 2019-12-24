parallelExecution in Global := false

lazy val XmlExtractor = crossProject.crossType(CrossType.Pure)

lazy val XmlExtractorJS = XmlExtractor.js

lazy val XmlExtractorJVM = XmlExtractor.jvm

organization in ThisBuild := "com.thoughtworks.binding"

publish / skip := true
