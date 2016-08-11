name := "readerwriter"

organization := "com.readerwriter"

version := "1.1"

scalaVersion := "2.10.5"


ivyScala := ivyScala.value map {_.copy(overrideScalaVersion = true)}


/*resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases"

resolvers += "Sonatype OSS Maven Repository" at "https://oss.sonatype.org/content/repositories/public"*/

resolvers += "Maven Central" at "http://central.maven.org/maven2/"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6"
  ,"org.scala-lang" % "scala-library" % "2.10.5" % "provided"
  ,"com.opencsv" % "opencsv" % "3.8"
  ,"org.apache.spark" % "spark-core_2.10" % "1.5.1"
  ,"org.slf4j" % "slf4j-simple" % "1.7.21"
)


publishTo := Some(Resolver.file("file",new File(Path.userHome.absolutePath +"/.ivy2/cache/")))