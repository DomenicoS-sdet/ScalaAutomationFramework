name := "ScalaAutomationFramework"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies += "info.cukes" % "cucumber-junit" % "1.2.5" % Test
libraryDependencies += "info.cukes" %% "cucumber-scala" % "1.2.5" % Test
libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "info.cukes" % "gherkin" % "2.12.2"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "3.141.59"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.0" % Test
libraryDependencies += "com.typesafe" % "config" % "1.3.4"
libraryDependencies += "com.aventstack" % "extentreports" % "3.1.2"
libraryDependencies += "com.vimalselvam" % "cucumber-extentsreport" % "3.0.2"
libraryDependencies += "commons-io" % "commons-io" % "2.6"
