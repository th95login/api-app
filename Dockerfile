FROM openjdk:22

COPY target/apispring-0.0.1-SNAPSHOT.war apiservice.war
ENTRYPOINT ["java", "-jar", "/apiservice.war"]