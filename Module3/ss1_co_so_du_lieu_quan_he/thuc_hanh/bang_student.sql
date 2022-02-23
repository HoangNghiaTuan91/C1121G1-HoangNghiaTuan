create database ss1_co_so_du_lieu_quan_he;
use ss1_co_so_du_lieu_quan_he;

create table student(
id int auto_increment,
name varchar(50),
age int,
country varchar(50),
primary key(id)
);
drop database my_database;
create database my_database;
use my_database;
create table student(
id int auto_increment,
name varchar(50),
age int,
country varchar(50),
primary key(id)
);

create table class(
id int auto_increment,
name varchar(50),
primary key(id)
);

create table teacher(
id int auto_increment,
name varchar(50),
age int,
check(age>=18),
country varchar(50),
primary key(id)
);
drop database ss1_co_so_du_lieu_quan_he;