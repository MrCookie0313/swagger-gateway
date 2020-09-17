FROM registry.sensetime.com/evoa-test/alpine-oraclejdk8:slim

WORKDIR /app

COPY target/*.jar .
RUN find -name "*.jar" -exec ln -s {} app.jar \;

ENV JAVA_OPTS="-XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m -Xms512m -Xmx512m -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC"

ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar app.jar
