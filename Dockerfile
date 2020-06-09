FROM openjdk:8
ADD target/jay-springboot-docker.jar jay-springboot-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","jay-springboot-docker.jar"]

