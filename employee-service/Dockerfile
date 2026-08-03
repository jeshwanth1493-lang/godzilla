# ---------- Stage 1 : Build ----------
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /build

COPY pom.xml .

COPY src ./src

COPY .mvn .mvn

COPY mvnw .

COPY mvnw.cmd .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests


# ---------- Stage 2 : Runtime ----------
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /build/target/employee-service.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]