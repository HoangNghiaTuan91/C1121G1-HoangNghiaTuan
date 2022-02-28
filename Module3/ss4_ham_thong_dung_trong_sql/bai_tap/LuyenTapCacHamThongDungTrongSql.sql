use ss3_bt_truy_van_du_lieu_qlsv;
-- cách 1 
select * from `subject` where credit >= all (select `subject`.credit from `subject`);
-- cách 2
select sub_id,sub_name,credit from `subject` where credit = (select max(credit) from `subject`); 

-- cách 1
select `subject`.sub_id,`subject`.sub_name from `subject` 
inner join mark on  `subject`.sub_id = mark.sub_id where mark.mark >= all(select mark.mark from mark) ;

-- cách 2
select `subject`.sub_id,`subject`.sub_name,mark.mark from `subject` 
inner join mark on  `subject`.sub_id = mark.sub_id where mark = (select max(mark) from mark);

select student.student_id,student.student_name,avg(mark.mark) as 'avg mark' from student 
inner join mark on student.student_id = mark.student_id
group by mark.student_id order by  'avg mark' desc; 
