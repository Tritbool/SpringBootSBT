ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.1"
libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot" % "2.6.3",
  "org.springframework" % "spring-core" % "5.3.15" exclude("commons-logging", "commons-logging"),
  "org.springframework.boot" % "spring-boot-configuration-processor" % "2.6.3",
  "org.springframework.boot" % "spring-boot-starter-web" % "2.6.3",
  "org.springframework.boot" % "spring-boot-starter-web-services" % "2.6.3",
  "org.springframework.boot" % "spring-boot-starter-webflux" % "2.6.3",
  "org.springframework.boot" % "spring-boot-starter-test" % "2.6.3",
  //"org.springframework.experimental" % "spring-native" % "0.11.2",
  "org.springframework.session" % "spring-session-core" % "2.6.1",
)


lazy val root = (project in file("."))
  .settings(
    name := "ScalaSB"
  )
