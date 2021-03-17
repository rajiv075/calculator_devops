FROM openjdk:8
COPY ./target/calculator_devOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator_devOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]