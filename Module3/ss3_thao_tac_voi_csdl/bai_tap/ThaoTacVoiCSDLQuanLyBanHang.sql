create database ss3_bt_thao_tac_voi_csdl_quan_lu_ban_hang;
use ss3_bt_thao_tac_voi_csdl_quan_lu_ban_hang;

CREATE TABLE customer (
    c_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    c_name VARCHAR(25),
    c_age INT
);

CREATE TABLE `order` (
    o_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    c_id INT,
    o_date DATE,
    o_total_price DOUBLE,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id)
);

CREATE TABLE product (
    p_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    p_name VARCHAR(50),
    p_price DOUBLE
);

CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    o_quantity INT,
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
        REFERENCES `order` (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id)
);

insert into `ss3_bt_thao_tac_voi_csdl_quan_lu_ban_hang`.`customer` (`c_id`, `c_name`, `c_age`) 
values 	('1', 'Minh Quan', '10'),
		('2', 'Ngoc Oanh', '20'),
        ('3', 'Hong Ha', '50');

insert into `order`(c_id,o_date) values 
(1, '2006-03-21'),
(2, '2006-03-23'),
(1, '2006-03-16');

insert into product(p_name,p_price) values
('May Giat', 3),
('Tu Lanh', 5),
('Dieu Hoa', 7),
('Quat', 1),
('Bep Dien', 2);

insert into order_detail values
(1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1),
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

-- hiển thị cột order id,order date và price 
SELECT 
    o_id, o_date, o_total_price
FROM
    `order`;
    
-- hiển thị danh sách khách hàng đã mua sản phẩm và các sản phẩm đã mua
SELECT 
    o.o_id,c.c_name, p.p_name
FROM
    customer c
        JOIN
    `order` o ON c.c_id = o.c_id
        JOIN
    order_detail o_d ON o.o_id = o_d.o_id
        JOIN
    product p ON p.p_id = o_d.p_id
    order by o.o_id;

-- hiển thị danh sách khách hàng không mua sản phẩm nào
SELECT 
 c.c_name
FROM
    customer as c
WHERE
    c.c_id NOT IN (SELECT 
            c_id
        FROM
            `order`);

-- hiển thị mã hoá đơn,ngày bán và giá tiền của từng hoá đơn 
SELECT 
    o.o_id,
    o.o_date,
    SUM(p.p_price * o_d.o_quantity) AS order_total_price
FROM
    `order` AS o
        JOIN
    order_detail AS o_d ON o.o_id = o_d.o_id
        JOIN
    product AS p ON p.p_id = o_d.p_id
GROUP BY o.o_id
ORDER BY o_d.o_id;
