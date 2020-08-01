FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/springboot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
docker build -t springboot .