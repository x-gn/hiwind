#/bin/bash

setenforce 0

#init database
docker pull mysql
docker rm -f hiwind_mysql
docker run --name hiwind_mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=maxmax -d mysql
yum install mysql -y
mysql -h 127.0.0.1 -uroot -pmaxmax < database_init.sql
