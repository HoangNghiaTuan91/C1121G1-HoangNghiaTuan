CREATE TABLE vi_tri (
    ma_vi_tri INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ten_vi_tri VARCHAR(45)
);

CREATE TABLE trinh_do (
    ma_trinh_do INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ten_trinh_do VARCHAR(45)
);

CREATE TABLE bo_phan (
    ma_bo_phan INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ten_bo_phan VARCHAR(45)
);

CREATE TABLE nhan_vien (
    ma_nhan_vien INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(45) not null,
    ngay_sinh DATE not null,
    so_cmnd VARCHAR(45) not null,
    luong DOUBLE not null,
    so_dien_thoai VARCHAR(45) not null,
    email VARCHAR(45),
    dia_chi VARCHAR(45),
    ma_vi_tri INT not null,
    ma_trinh_do INT not null,
    ma_bo_phan INT not null,
    FOREIGN KEY (ma_vi_tri)
        REFERENCES vi_tri (ma_vi_tri),
    FOREIGN KEY (ma_trinh_do)
        REFERENCES trinh_do (ma_trinh_do),
    FOREIGN KEY (ma_bo_phan)
        REFERENCES bo_phan (ma_bo_phan)
);


CREATE TABLE loai_khach (
    ma_loai_khach INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ten_loai_khach VARCHAR(45)
);

CREATE TABLE khach_hang (
    ma_khach_hang INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(45) not null,
    ngay_sinh DATE not null,
    gioi_tinh BIT(1) not null,
    so_cmnd VARCHAR(45) not null,
    so_dien_thoai VARCHAR(45) not null,
    email VARCHAR(45),
    dia_chi VARCHAR(45),
    ma_loai_khach INT not null,
    FOREIGN KEY (ma_loai_khach)
        REFERENCES loai_khach (ma_loai_khach)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int not null auto_increment primary key,
ten_dich_vu_di_kem varchar(45) not null,
gia double not null,
don_vi varchar(10) not null,
trang_thai varchar(45)
);

create table loai_dich_vu(
ma_loai_dich_vu int not null auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

create table kieu_thue(
ma_kieu_thue int not null auto_increment primary key,
ten_kieu_thue varchar(45)
);

create table dich_vu(
ma_dich_vu int not null auto_increment primary key,
ten_dich_vu varchar(45) not null,
dien_tich int,
chi_phi_thue double not null,
so_nguoi_toi_da int,
ma_kieu_thue int not null,
ma_loai_dich_vu int not null,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table hop_dong(
ma_hop_dong int not null auto_increment primary key,
ngay_lam_hop_dong datetime not null,
ngay_ket_thuc datetime not null,
tien_dat_coc double not null,
ma_nhan_vien int not null,
ma_khach_hang int not null,
ma_dich_vu int not null,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int not null auto_increment primary key,
ma_hop_dong int not null,
ma_dich_vu_di_kem int not null,
so_luong int not null,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);


