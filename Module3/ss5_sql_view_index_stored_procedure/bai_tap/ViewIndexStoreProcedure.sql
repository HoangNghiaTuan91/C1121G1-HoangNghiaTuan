-- step 1:tạo cơ sở dữ liệu demon
create database demon;
-- step 2:tạo bảng nhập thông tin mẫu
create table products(
id int not null auto_increment primary key,
product_code varchar(20),
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(100),
product_status bit(1)
);

insert into products values   
('1', 'S10_1678', '1969 Harley Davidson Ultimate Chopper', '95.34', '56', 'abc',1),
('2','S10_1949','1952 Alpine Renault 1300','96.34','57','abc',0),
('3','S10_2016','1996 Moto Guzzi 1100i','97.34','58','abc',1),
('4','S10_4698','2003 Harley-Davidson Eagle Dragike','98.34','59','abc',1),
('5','S10_4757','1972 Alfa Romeo GTA','99.34','60','abc',0),
('6','S10_4962','1962 LanciaA Delta 16V','100.34','61','abc',0),
('7','S12_1099','1968 Ford Mustang','101.34','62','abc',1);

-- step 3:tạo unique index
create unique index product_index on products(product_code);
drop index product_index on products;
-- step 3:tạo composite index
create index product_name_price_index on products(product_name,product_price);

drop index product_name_price_index on products;

-- step 3:sử dụng explain

explain select * from products where product_code = 'S10_1678';
explain select * from products where product_name = '1996 Moto Guzzi 1100i' and product_price = 97.34 ;

-- step 4:tạo view 

create view product_info as
select products.product_code,products.product_name,products.product_price,products.product_status from products;

select * from product_info;

-- step 4:chỉnh sửa view

alter view product_info as
select products.product_code,products.product_name,products.product_price from products;
-- step 4:drop view 
drop view product_info;

-- step 5:Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure find_all()
begin
select * from products;
end //
delimiter ;
call find_all();

-- step 5:Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure insert_new_product(product_code varchar(20),product_name varchar(100),product_price double,product_amount int,product_description varchar(100),product_status bit(1))
begin
insert into products (products.product_code,products.product_name ,products.product_price ,products.product_amount,products.product_description ,products.product_status)
values (product_code,product_name ,product_price ,product_amount,product_description ,product_status );
end //
delimiter ;

call insert_new_product('S11_6560','2021 Ford Explorer',50,80.00,'brand new',1);

-- step 5:Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure modify_product_info_by_id( product_id_new int, product_code_new varchar(20), product_name_new varchar(100), product_price_new double, product_amount_new int, product_description_new varchar(100), product_status_new bit(1))
begin
update products
set products.product_code = product_code_new,
products.product_name = product_name_new,
products.product_price = product_price_new,
products.product_amount = product_amount_new,
products.product_description = product_description_new,
products.product_status = product_status_new
where products.id = product_id_new;
end //
delimiter ;

set sql_safe_updates = 0;
call modify_product_info_by_id(2,'S11_7951','2022 Kia Seltos',50,80.00,'brand new',1);
set sql_safe_updates = 1;

-- step 5:delele sản phẩm theo id

delimiter //
create procedure delete_product_info_by_id( product_id_new int)
begin
delete from products
where products.id = product_id_new;
end //
delimiter ;

call delete_product_info_by_id(3);