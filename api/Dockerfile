# 基础镜像使用java
FROM openjdk:11-oracle
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp 
ARG JAR_FILE
ARG LIVE_ENV
# 将jar包添加到容器中并更名为mydocker.jar
ADD target/${JAR_FILE} /home/app.jar 
# 运行jar包
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/app.jar","--spring.profiles.active=${LIVE_ENV}"]