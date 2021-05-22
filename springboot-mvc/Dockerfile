FROM openjdk:8-jre

#from
#copy/add
#env/arg
#volume
#workdir
#expose
#run
#cmd/entrypoint

ENV WORK_PATH /data/demo
ENV APP_NAME ./target/*.jar
#ENV JAVA_OPTS -Xmx1280m -Xss256k

WORKDIR $WORK_PATH

#EXPOSE 8090
VOLUME ["/data/demo", "/tmp/demo"]

COPY $APP_NAME $WORK_PATH/springmvc.jar

#GMT+8
RUN echo "Asia/Shanghai" > /etc/timezone

ENTRYPOINT exec java $JAVA_OPTS -jar -Djava.security.egd=file:/dev/./urandom -jar springmvc.jar

#CMD ["java","-jar", "/data/demo/springmvc.jar"]