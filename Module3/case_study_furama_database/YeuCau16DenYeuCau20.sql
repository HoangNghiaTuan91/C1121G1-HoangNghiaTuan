use case_study_database;

-- YC16:Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

-- select nhan_vien.ma_nhan_vien,nhan_vien.ho_ten
-- from nhan_vien where nhan_vien.ma_nhan_vien not in(select nhan_vien.ma_nhan_vien
-- from nhan_vien inner join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
-- where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021
-- group by nhan_vien.ma_nhan_vien
-- having count(hop_dong.ma_hop_dong) > 0);

-- select nhan_vien.ma_nhan_vien,nhan_vien.ho_ten from nhan_vien
-- where nhan_vien.ma_nhan_vien not in (select hop_dong.ma_nhan_vien from hop_dong where year(hop_dong.ngay_lam_hop_dong) in (2019,2020,2021));

-- -- YC17:Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- -- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
set sql_safe_updates = 0;
update khach_hang
set khach_hang.ma_loai_khach = 1 where khach_hang.ma_loai_khach = 2 
and khach_hang.ma_khach_hang in 
(select hop_dong.ma_khach_hang from hop_dong 
inner join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
inner join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
where year(hop_dong.ngay_lam_hop_dong) = 2021
group by hop_dong.ma_khach_hang
having sum(ifnull(dich_vu.chi_phi_thue,0)+ifnull(hop_dong_chi_tiet.so_luong,0)*ifnull(dich_vu_di_kem.gia,0)) > 10000000);
set sql_safe_updates = 1;

select khach_hang.ma_khach_hang,khach_hang.ho_ten,khach_hang.ma_loai_khach from khach_hang
where khach_hang.ma_loai_khach = 1;

-- YC18:Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

-- set sql_safe_updates = 0;
create temporary table temp_hop_dong_chi_tiet(
select hop_dong_chi_tiet.ma_hop_dong from hop_dong_chi_tiet 
inner join hop_dong on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong where year(hop_dong.ngay_lam_hop_dong)<2021);

delete from hop_dong_chi_tiet where hop_dong_chi_tiet.ma_hop_dong in (select * from abc);

 select * from hop_dong_chi_tiet;
 create temporary table temp_hop_dong(
 select hop_dong.ma_hop_dong from hop_dong where year(hop_dong.ngay_lam_hop_dong)<2021);

delete from hop_dong where hop_dong.ma_hop_dong in (select * from temp_hop_dong);

create temporary table temp_khach_hang(
select khach_hang.ma_khach_hang from khach_hang 
inner join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang where year(hop_dong.ngay_lam_hop_dong)>=2021);

delete from khach_hang where khach_hang.ma_khach_hang not in (select * from temp_khach_hang);

-- delete from khach_hang where khach_hang.ma_khach_hang 
-- in (select hop_dong.ma_khach_hang from hop_dong where year(hop_dong.ngay_lam_hop_dong) < 2021);
-- set sql_safe_updates = 1;

-- YC19:Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
-- set sql_safe_updates = 0;
-- update dich_vu_di_kem
-- set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
-- where dich_vu_di_kem.ma_dich_vu_di_kem in 
-- (select dich_vu_di_kem.ma_dich_vu_di_kem from dich_vu_di_kem
-- inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
-- inner join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong_chi_tiet
-- where year(hop_dong.ngay_lam_hop_dong) = 2020
-- group by hop_dong_chi_tiet.ma_dich_vu_di_kem
-- having sum(ifnull(hop_dong_chi_tiet.so_luong,0))>10);
-- set sql_safe_updates = 1;

-- YC20:Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select 
nhan_vien.ma_nhan_vien as id,
nhan_vien.ho_ten,
nhan_vien.so_dien_thoai,
nhan_vien.ngay_sinh,
nhan_vien.so_cmnd,
nhan_vien.dia_chi from nhan_vien
union all select 
khach_hang.ma_khach_hang as id,
khach_hang.ho_ten,
khach_hang.so_dien_thoai,
khach_hang.ngay_sinh,
khach_hang.so_cmnd,
khach_hang.dia_chi from khach_hang;



























