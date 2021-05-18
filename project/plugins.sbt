// Comment to get more information during initialization
logLevel := Level.Info

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play"   % "sbt-plugin"           % "2.8.3")
addSbtPlugin("org.foundweekends"   % "sbt-bintray"          % "0.5.1")
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"         % "2.4.2")
addSbtPlugin("com.codecommit"      % "sbt-github-packages"  % "0.3.0")
