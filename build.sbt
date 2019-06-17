name := "configuration"

version := "0.1"

scalaVersion := "2.12.8"

val configuration1 = project in file("configuration1")
val configuration2 = project in file("configuration2")
val configuration3 = project in file("configuration3")
val configuration4 = project in file("configuration4")
val configuration5 = project in file("configuration5")
val configuration6 = project in file("configuration6")

val root =  project.in(file(".")).aggregate(
  configuration1,
  configuration2,
  configuration3,
  configuration4,
  configuration5,
  configuration6
)