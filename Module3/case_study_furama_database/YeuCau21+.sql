use case_study_database;

create view v_nhan_vien as
    select 
        nhan_vien.ma_nhan_vien,
        nhan_vien.ho_ten,
        nhan_vien.ngay_sinh,
        nhan_vien.so_dien_thoai,
        nhan_vien.email,
        nhan_vien.dia_chi
    from nhan_vien 
            inner join 
        hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
    where
        nhan_vien.dia_chi like '%Dak Lak%'
            and hop_dong.ngay_lam_hop_dong = '2021-06-17';
            
            select * from v_nhan_vien;
            
drop view v_nhan_vien;

select * from v_nhan_vien;
set sql_safe_updates = 0;
update v_nhan_vien
set dia_chi = replace(dia_chi,'Dak Lak','Gia Lai')
where dia_chi like '%Dak Lak%';
set sql_safe_updates = 1;


delimiter //
create procedure sp_xoa_khach_hang(ma_khach_hang_can_xoa int)
begin
delete from khach_hang where khach_hang.ma_khach_hang = ma_khach_hang_can_xoa;
end //
delimiter ;