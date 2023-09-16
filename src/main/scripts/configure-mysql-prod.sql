## Use to run mysql db docker image
docker run --name mysqlproddb -v /tmp/dockerdata/aa-mysql-prod:/var/lib/mysql -p 3307:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

#connect to mysql docker and run as root user
#Create Databases
CREATE DATABASE aa_recipeapp_prod;

#Create database service accounts
CREATE USER 'aa_recipeapp_prod_user'@'%' IDENTIFIED BY 'prod';

#Database grants
GRANT SELECT ON aa_recipeapp_prod.* to 'aa_recipeapp_prod_user'@'%';
GRANT INSERT ON aa_recipeapp_prod.* to 'aa_recipeapp_prod_user'@'%';
GRANT DELETE ON aa_recipeapp_prod.* to 'aa_recipeapp_prod_user'@'%';
GRANT UPDATE ON aa_recipeapp_prod.* to 'aa_recipeapp_prod_user'@'%';

