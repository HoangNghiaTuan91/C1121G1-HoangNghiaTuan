use classicmodels;

delimiter //
create procedure getcusbyid(in cusnum int(11))
begin
select * from customers where customerNumber = cusnum;
end //
delimiter ;

call getcusbyid(175);

delimiter //
create procedure getcustomerscountbycity(in in_city varchar(50), out total int)
begin
select count(customers.customerNumber)
into total from customers 
where city = in_city;
end //
delimiter ;

CALL GetCustomersCountByCity('Lyon',@total);

SELECT @total;