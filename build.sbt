libraryDependencies := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, scalaMajor)) if scalaMajor >= 11 =>
      libraryDependencies.value :+ "org.scala-lang.modules" %% "scala-xml" % "1.0.3"
    case _ =>
      libraryDependencies.value 
  }
}

libraryDependencies ++= List(
  "jfree" % "jfreechart" % "1.0.12",
  "commons-io" % "commons-io" % "2.0"
)

organization := "com.github.jsuereth"

name := "sperformance"

version := "0.1"

scalaVersion := "2.11.7"

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation", "-feature")
