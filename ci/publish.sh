#/bin/bash


#init database
docker pull mysql
#docker rm -f hiwind_mysql
docker run --name hiwind_mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=maxmax -d mysql
yum install mysql -y
mysql -h 127.0.0.1 -uroot -pmaxmax < database_init.sql


#init tomcat 
docker run --name hiwind_tomcat -d tomcat 
docker run --privileged --cap-add SYS_ADMIN -e container=docker -it --name hiwind_tomcat -p 0.0.0.0:8080:8080 -d --restart=always tomcat
sudo docker run -d -p 8080:8080 -v /tomcat/webapps:/usr/local/tomcat/webapps  tomcat:latest
