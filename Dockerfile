# base image

FROM openjdk:11

# irngedwelche sachen hinzfügen

# kommandos ausführen
COPY target/*.jar demo.jar

# App starten

ENTRYPOINT ["java", "-jar", "/demo.jar"]