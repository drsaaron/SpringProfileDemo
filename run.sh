#! /bin/sh

jarFile=target/$(getPomAttribute.sh artifactId)-$(getPomAttribute.sh version).jar

java -jar $jarFile --spring.profiles.active=integration
java -jar $jarFile --spring.profiles.active=prod
