FROM azul/zulu-openjdk:11
COPY build/libs/*.jar /app.jar
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]

# FROM azul/zulu-openjdk:11
# ARG JAR_FILE
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]

# docker run -it -d --name sample-api1 --network sample-apps_sample-network --hostname sample-api1.polymarket.kr sample-api1:local