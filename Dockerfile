# base image

FROM openjdk:11
# irngedwelche sachen hinzfügen

# Adding a VOLUME at /tmp, because it's the Tomcat default working dir, created by Spring-Boot,
# change if you're going to use Netty or not needed at all!
VOLUME /tmp

# make port 80 available to the world outside this container
EXPOSE 80

# kommandos ausführen
COPY target/*.jar demo.jar

# App starten

ENTRYPOINT ["java", "-jar", "/demo.jar"]