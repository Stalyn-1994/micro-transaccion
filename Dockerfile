FROM openjdk:11
COPY "./target/spring-boot-docker.jar" "micro-transaccion.jar"
EXPOSE 9095
ENTRYPOINT [ "java", "-jar", "micro-transaccion.jar" ]
