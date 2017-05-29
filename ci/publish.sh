#/bin/bash

docker pull mysql
docker run --name hiwind_mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=maxmax -d mysql

yum install mysql -y
mysql -uroot -pmaxmax < database_init.sql


