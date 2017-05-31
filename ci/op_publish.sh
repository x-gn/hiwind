#/bin/bash

#init tomcat 
#docker run --name hiwind_tomcat -d tomcat 
#docker run --privileged --cap-add SYS_ADMIN -e container=docker -it --name hiwind_tomcat -p 0.0.0.0:8080:8080 -d --restart=always tomcat
mkdir -p /home/tomcat/webapps/
rm -f /home/tomcat/webapps/hiwind.war
cd ..
jar -cvf /home/tomcat/webapps/hiwind.war */ .
docker rm -f  hiwind_tomcat
sudo docker run --name hiwind_tomcat -d -p 8080:8080 -v /home/tomcat/webapps/:/usr/local/tomcat/webapps  tomcat
