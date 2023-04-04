FROM eclipse-temurin:17-jdk-focal as builder
WORKDIR /build
ARG JAR_FILE=target/auth-server.jar
COPY ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract && rm app.jar

FROM eclipse-temurin:17-jdk-focal
LABEL maintainer="jclazz@outlook.com"
ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms256m -Xmx512m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=256m -XX:+UseG1GC -Djava.security.egd=file:/dev/./urandom"
ENV NACOS_HOST=127.0.0.1 NACOS_PORT=8848 NACOS_GROUP=DEFAULT_GROUP
WORKDIR /app

COPY --from=builder /build/dependencies/ ./
COPY --from=builder /build/snapshot-dependencies/ ./
COPY --from=builder /build/spring-boot-loader/ ./
COPY --from=builder /build/application/ ./

EXPOSE 28030

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} org.springframework.boot.loader.PropertiesLauncher ${0} ${@}"]