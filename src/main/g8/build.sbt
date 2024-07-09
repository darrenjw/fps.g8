// build.sbt

name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature", "-language:higherKinds",
  "-language:implicitConversions"
)

enablePlugins(MdocPlugin)

libraryDependencies  ++= Seq(
  "org.scalameta" %% "munit" % "1.0.0" % Test,
  "org.scalameta" %% "munit-scalacheck" % "1.0.0" % Test,
  "org.typelevel" %% "discipline-munit" % "2.0.0" % Test,
  "org.typelevel" %% "cats-core" % "2.12.0",
  "org.typelevel" %% "cats-free" % "2.12.0",
  "org.typelevel" %% "cats-laws" % "2.12.0",
  "org.typelevel" %% "cats-effect" % "3.5.4",
  "org.typelevel" %% "discipline-core" % "1.7.0"
)

val monocleVersion = "3.2.0"
libraryDependencies ++= Seq(
  "dev.optics" %%  "monocle-core"  % monocleVersion,
  "dev.optics" %%  "monocle-law"   % monocleVersion % "test"
)

val circeVersion = "0.14.9"
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "3.3.3"

fork := true

// eof

