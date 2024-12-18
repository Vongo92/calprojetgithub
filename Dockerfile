FROM maven
COPY target/calculator2-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]

