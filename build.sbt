enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

/** Name of project */
name := "Jolt.js"

/** Organization */
organization := "com.github.sguzman"

/** Project Version */
version := "1.0"

/** Scala version */
scalaVersion := "2.12.4"

/** Scalac parameters */
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-server")

/** Resolver */
resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.sonatypeRepo("public"),
  Resolver.typesafeRepo("releases"),
  Resolver.sbtPluginRepo("releases"),
  Resolver.jcenterRepo,
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  "com.thoughtworks.binding" %%% "dom" % "11.0.1",
  "io.circe" %%% "circe-core" % "0.9.2",
  "io.circe" %%% "circe-parser" % "0.9.2",
  "io.circe" %%% "circe-generic" % "0.9.2",
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

/** Make sure to fork on run */
fork in run := true