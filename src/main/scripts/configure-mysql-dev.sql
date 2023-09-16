#connect to mysql on your local system and run as root user
#or you can create another docker image for dev environment by running the following command on your terminal and run as root user
docker run --name mysqldevdb -v /tmp/dockerdata/aa-mysql-dev:/var/lib/mysql -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

#Create Databases
CREATE DATABASE aa_recipeapp_dev;

#Create database service accounts
CREATE USER 'aa_recipeapp_dev_user'@'localhost' IDENTIFIED BY 'dev';

#Database grants
GRANT SELECT ON aa_recipeapp_dev.* to 'aa_recipeapp_dev_user'@'localhost';
GRANT INSERT ON aa_recipeapp_dev.* to 'aa_recipeapp_dev_user'@'localhost';
GRANT DELETE ON aa_recipeapp_dev.* to 'aa_recipeapp_dev_user'@'localhost';
GRANT UPDATE ON aa_recipeapp_dev.* to 'aa_recipeapp_dev_user'@'localhost';