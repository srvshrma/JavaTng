FROM openjdk:8-jre-alpine

COPY target/docker_demo-0.0.1-SNAPSHOT.jar /usr/share

WORKDIR /usr/share

ENTRYPOINT ["java","-cp", "docker_demo-0.0.1-SNAPSHOT.jar", "dockerProject.docker_demo.App"]