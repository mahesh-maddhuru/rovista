FROM maven:3.8.4-openjdk-17-slim AS build

MAINTAINER Mahesh
ARG JDBC_URL
ARG USERNAME
ARG PASSWORD

COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Djdbc-url=${JDBC_URL} -Dusername=${USERNAME} -Dpassword=${PASSWORD}

#
# Package stage
#
FROM openjdk:17.0.2-jdk

MAINTAINER Mahesh
ARG JDBC_URL
ARG USERNAME
ARG PASSWORD

COPY --from=build /home/app/target/rovista-api.jar /usr/local/lib/rovista-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Djdbc-url=${JDBC_URL}", "-Dusername=${USERNAME}", "-Dpassword=${PASSWORD}", "/usr/local/lib/rovista-api.jar"]
