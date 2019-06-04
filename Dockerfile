FROM openjdk:8-jdk-alpine
MAINTAINER zhouxu "zhouxu@pioneerservice.cn"


ADD docker-env.jar docker-env.jar
ADD config.sh config.sh
RUN chmod a+x config.sh
EXPOSE 8082

ENV DB_HOST localhost
ENV DB_PORT 3306
ENV DB_USERNAME root
ENV DB_PASSWORD root

CMD /config.sh
#ENTRYPOINT ["java", "-jar", "-Duser.timezone=GMT+08", "/docker-env.jar"]
