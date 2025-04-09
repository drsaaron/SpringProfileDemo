#! /bin/sh

jarFile=target/$(getPomAttribute.sh artifactId)-$(getPomAttribute.sh version).jar

runJar() {
    profile=$1

    java -jar $jarFile --spring.profiles.active=$profile
}

runJar integration
runJar prod
