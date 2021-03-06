name := "sockjs-protocol-test"

version := "0.1"

scalaVersion := "2.12.2"

enablePlugins(PlayJava, PlayNettyServer)
disablePlugins(PlayAkkaHttpServer)

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  guice,
  "com.github.fdimuccio" %% "play2-sockjs" % "0.6.0-M1"
)

javaOptions += "-Xmx1G"

fork in run := true