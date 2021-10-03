// build.sbt

name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature", "-language:higherKinds",
  "-language:implicitConversions", "-Ykind-projector:underscores"
)

enablePlugins(MdocPlugin)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest-propspec" % "3.2.9" % "test",
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % "test",
  "org.typelevel" %% "cats-core" % "2.6.1",
  "org.typelevel" %% "cats-free" % "2.6.1",
  "org.typelevel" %% "cats-laws" % "2.6.1",
  "org.typelevel" %% "cats-effect" % "3.2.2",
  "org.typelevel" %% "discipline-core" % "1.1.5",
  "org.typelevel" %% "discipline-scalatest" % "2.1.5"
)

val monocleVersion = "3.0.0"
libraryDependencies ++= Seq(
  "dev.optics" %%  "monocle-core"  % monocleVersion,
  "dev.optics" %%  "monocle-law"   % monocleVersion % "test"
)

val circeVersion = "0.14.1"
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

scalaVersion := "3.0.1"


// eof

