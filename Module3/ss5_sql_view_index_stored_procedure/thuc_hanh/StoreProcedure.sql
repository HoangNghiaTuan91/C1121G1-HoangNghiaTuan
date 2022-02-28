use classicmodels;

delimiter //
create procedure findallcustomer()
begin 
select * from customers;
end //
delimiter ;
 
call findallcustomer();

delimiter //
drop procedure if exists `findallcustomer` //
create procedure findallcustormer()
begin
select * from customers where customerNumber = 175;
end //
delimiter ;

call findallcustormer();
