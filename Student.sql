create database projectdb;
use projectdb;
create table studenttab(
id int PRIMARY KEY AUTO_INCREMENT,
sname varchar(20),
scource varchar(30),
sfee int
);

select * from studenttab;

drop table studenttab;