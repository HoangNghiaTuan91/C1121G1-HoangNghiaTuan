
CREATE TABLE class
(
    class_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME    NOT NULL,
    `status`    BIT
);
CREATE TABLE student
(
    student_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(30) NOT NULL,
    address     VARCHAR(50),
    phone       VARCHAR(20),
    `status`      BIT,
    class_id     INT         NOT NULL,
    FOREIGN KEY (class_id) REFERENCES class (class_id)
);
CREATE TABLE `subject`
(
    sub_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_name VARCHAR(30) NOT NULL,
    credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( credit >= 1 ),
    `status`  BIT                  DEFAULT 1
);

CREATE TABLE mark
(
    mark_id    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_id     INT NOT NULL,
    student_id INT NOT NULL,
    mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1,
    UNIQUE (sub_id, student_id),
    FOREIGN KEY (sub_id) REFERENCES `subject` (sub_id),
    FOREIGN KEY (student_id) REFERENCES student (student_id)
);

insert into class(class_name,start_date,`status`) values ('A1', '2008-12-20', 1);
insert into class(class_name,start_date,`status`) values ('A2', '2008-12-22', 1);
insert into class(class_name,start_date,`status`) values ('B3', current_date, 0);
insert into `subject`(sub_name,credit,`status`) values ( 'CF', 5, 1),('C', 6, 1),('HDJ', 5, 1),('RDBMS', 10, 1);
insert into student (student_name, address, phone, `status`, class_id) values ('Hung', 'Ha Noi', '0912113113', 1, 1),('Hoa', 'Hai phong','0905419668', 1, 1),('Manh', 'HCM', '0123123123', 0, 2);
insert into mark(sub_id, student_id, mark, exam_times) values (1, 1, 8, 1),(1, 2, 10, 2),(2, 1, 12, 1);

select * from student where student_name like 'h%';
select * from class where month(start_date) = '12';
select * from `subject` where (credit between 3 and 5);
set sql_safe_updates = 0;
update student set class_id = 2 where student_name = 'hung';
set sql_safe_updates = 1;
select s.student_name,m.mark,sub.sub_name from student s join mark m on s.student_id = m.student_id
join `subject` sub on m.sub_id = sub.sub_id
order by m.mark desc,s.student_name asc;
