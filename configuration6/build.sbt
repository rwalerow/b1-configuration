version := "1.0"

lazy val `configurationblog` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice, "com.github.pureconfig" %% "pureconfig" % "0.11.0")

unmanagedResourceDirectories in Test +=  (baseDirectory ( _ /"configuration6/target/web/public/test" )).value

