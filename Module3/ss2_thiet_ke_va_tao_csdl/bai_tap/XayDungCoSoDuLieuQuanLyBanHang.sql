CREATE TABLE customer (
    c_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    c_name VARCHAR(30),
    c_age INT,
    CHECK (c_age > 0)
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
