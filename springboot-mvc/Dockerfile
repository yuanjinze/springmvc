FROM openjdk:8-jre

ENV  WORKPATH  /data/demo
ENV  APPNAME   ./target/springmvc.jar

VOLUME ["/data/demo", "/tmp/demo"]
WORKDIR $WORKPATH

COPY $APPNAME  $WORKPATH/springmvc.jar
#COPY run.sh    /data/demo/

#RUN  echo "Asia/Shanghai" > /etc/timezone

CMD ["java","-jar", "/data/demo/springmvc.jar"]
