use ss3_bt_truy_van_du_lieu_qlsv;

select address,count(student_id) as 'Số lượng học viên' from student group by address;

select student.student_id,student.student_name,avg(mark) from student 
inner join mark on student.student_id = mark.student_id 
group by student.student_id,student.student_name;

select student.student_id,student.student_name,avg(mark) from student 
inner join mark on student.student_id = mark.student_id 
group by student.student_id,student.student_name having avg(mark);

select student.student_id,student.student_name,avg(mark) from student 
inner join mark on student.student_id = mark.student_id 
having avg(mark) >= all(select avg(mark) from mark group by mark.student_id);