FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Definir el archivo JAR que se va a copiar
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

# Copiar el archivo JAR generado en el contenedor
COPY ${JAR_FILE} app.jar

# Exponer el puerto que tu aplicación usa (ej: 8080)
EXPOSE 8080

# Comando para correr la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
