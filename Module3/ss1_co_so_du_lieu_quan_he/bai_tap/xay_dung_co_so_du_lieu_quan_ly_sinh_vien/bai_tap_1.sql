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