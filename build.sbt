name := "play-pac4j-java-demo"

version := "4.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  ehcache, // or cacheApi
  "org.pac4j" % "play-pac4j" % "4.0.0-SNAPSHOT",
  "org.pac4j" % "pac4j-http" % "2.1.0",
  "org.pac4j" % "pac4j-cas" % "2.1.0",
  "org.pac4j" % "pac4j-openid" % "2.1.0" exclude("xml-apis" , "xml-apis"),
  "org.pac4j" % "pac4j-oauth" % "2.1.0",
  "org.pac4j" % "pac4j-saml" % "2.1.0",
  "org.pac4j" % "pac4j-oidc" % "2.1.0" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-gae" % "2.1.0",
  "org.pac4j" % "pac4j-jwt" % "2.1.0" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-ldap" % "2.1.0",
  "org.pac4j" % "pac4j-sql" % "2.1.0",
  "org.pac4j" % "pac4j-mongo" % "2.1.0",
  "org.pac4j" % "pac4j-kerberos" % "2.1.0",
  "org.pac4j" % "pac4j-couch" % "2.1.0",
  "com.typesafe.play" % "play-cache_2.12" % "2.6.2",
  "commons-io" % "commons-io" % "2.4",
  "be.objectify" %% "deadbolt-java" % "2.6.1"
)

resolvers ++= Seq(Resolver.mavenLocal, "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/")

routesGenerator := InjectedRoutesGenerator
