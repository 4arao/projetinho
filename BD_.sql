create database db_mysql;
use db_mysql;
create table login(
login varchar(20) unique not null,
senha varchar(20)
);
select * from login;








drop database db_mysql;