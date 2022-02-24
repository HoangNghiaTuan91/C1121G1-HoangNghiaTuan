create table phieu_xuat(
so_phieu_xuat int auto_increment not null primary key,
ngay_xuat datetime
);

create table vat_tu(
ma_vat_tu int auto_increment not null primary key,
ten_vat_tu varchar(20)
);

create table chi_tiet_phieu_xuat(
don_gia_xuat double,
so_luong_xuat int,
so_phieu_xuat int not null,
ma_vat_tu int not null,
primary key(so_phieu_xuat,ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap(
so_phieu_nhap int not null auto_increment primary key,
ngay_nhap datetime
);

create table chi_tiet_phieu_nhap(
don_gia_nhap double,
so_luong_nhap int,
so_phieu_nhap int not null,
ma_vat_tu int not null,
primary key(so_phieu_nhap,ma_vat_tu),
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table nha_cung_cap(
ma_nha_cung_cap int not null auto_increment primary key,
ten_nha_cung_cap varchar(30),
dia_chi varchar(50)
);

create table don_hang(
so_don_hang int not null auto_increment primary key,
ngay_tao_don_hang datetime,
ma_nha_cung_cap int,
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table chi_tiet_don_dat_hang(
ma_vat_tu int not null,
so_don_hang int,
primary key(ma_vat_tu,so_don_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_don_hang) references don_hang(so_don_hang)
);

create table so_dien_thoai(
ma_so_dien_thoai int primary key,
so_dien_thoai int not null,
ma_nha_cung_cap int,
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);