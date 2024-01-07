FROM gradle:latest as builder

WORKDIR /app

VOLUME ["~/.gradle/caches", "/app/.gradle"]
COPY . .
RUN ["gradle", "build"]

FROM openjdk:latest

COPY --from=builder /app/build/libs/price-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-server", "-jar", "/app/app.jar", "-web -webAllowOthers -tcp -tcpAllowOthers -browser"]

