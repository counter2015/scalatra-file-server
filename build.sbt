val ScalatraVersion = "2.6.5"

organization := "com.example"

name := "scalatra1"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatra" %% "scalatra-scalate" % ScalatraVersion
  //json support
//  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
//  "org.json4s" %% "json4s-jackson" % "3.3.0",
//
//  //scalaz
//  "org.scalaz" %% "scalaz-core" % "7.2.27"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)

scalacOptions += "-feature"