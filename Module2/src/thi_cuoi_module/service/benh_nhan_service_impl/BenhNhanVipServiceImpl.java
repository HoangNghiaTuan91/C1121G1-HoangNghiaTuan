package thi_cuoi_module.service.benh_nhan_service_impl;

import thi_cuoi_module.model.BenhAn;
import thi_cuoi_module.model.BenhAnBenhNhanVip;
import thi_cuoi_module.service.BenhNhanService1;
import thi_cuoi_module.util.ReadAndWrite;
import thi_cuoi_module.util.Regex;

import java.util.List;
import java.util.Scanner;

public class BenhNhanVipServiceImpl implements BenhNhanService1 {
    public static final String MA_BENH_AN_REGEX = "^BA-\\d{3}$";
    public static final String MA_BENH_NHAN_REGEX = "^BN-\\d{3}$";
    public static final String NGAY_THANG_REGEX = "^(([1-2][\\d])|(0+[1-9])|(3+[0-1]))[/]+((0+[1-9])|(1+[0-2]))+[/]+[\\d]{4}$";
    public static final String DUONG_DAN_FILE = "src/thi_cuoi_module/data/benhnhan.csv";
    Scanner sc = new Scanner(System.in);

    @Override
    public void them() {
        List<BenhAn> benhNhanList = ReadAndWrite.readBenhNhanFromCSVFile(DUONG_DAN_FILE);
        System.out.println("-----Them moi benh nhan Vip-----");
        int soThuTu;
        if (benhNhanList.isEmpty()) {
            soThuTu = 1;
        } else {
            soThuTu = benhNhanList.get(benhNhanList.size() - 1).getSoThuTu() + 1;
        }
        String maBenhAn = maBenhAn();
        String maBenhNhan = maBenhNhan();
        System.out.println("Nhap ten benh nhan");
        String tenBenhNhan = sc.nextLine();
        String ngayNhapVien = ngayNhapVien();
        String ngayXuatVien = ngayXuatVien();
        System.out.println("Ly do nam vien");
        String lyDoNamVien = sc.nextLine();
        System.out.println("Goi Vip");
        String goiVip = "";
        boolean flag = false;
        do {
            flag = false;
            int luaChonGoiVip = 0;
            try {
                System.out.println("Chon 1 goi VIP");
                System.out.println("1\tVIP I");
                System.out.println("2\tVIP II");
                System.out.println("3\tVIP III");
                luaChonGoiVip = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (luaChonGoiVip) {
                case 1:
                    goiVip = "VIP I";
                    break;
                case 2:
                    goiVip = "VIP II";
                    break;
                case 3:
                    goiVip = "VIP III";
                    break;
                case 4:
                    break;
                default:
                    flag = true;
                    System.out.println("Vui long chon 1-3");
            }
        } while (flag);
        String thoiHanVip = thoiHanVip();
        BenhAnBenhNhanVip benhNhanVip = new BenhAnBenhNhanVip(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayXuatVien, lyDoNamVien, goiVip, thoiHanVip);
        benhNhanList.add(benhNhanVip);
        ReadAndWrite.writeListToCSVFile(benhNhanList, DUONG_DAN_FILE, false);

    }

    private String maBenhAn() {
        System.out.println("Nhap ma benh an");
        return Regex.regexStr(sc.nextLine(), MA_BENH_AN_REGEX, "Ma benh an co dang BA-XXX voi X la so tu nhien");
    }

    private String maBenhNhan() {
        System.out.println("Nhap ma benh nhan");
        return Regex.regexStr(sc.nextLine(), MA_BENH_NHAN_REGEX, "Ma benh an co dang BN-XXX voi X la so tu nhien");
    }
    private String ngayNhapVien(){
        System.out.println("Ngay nhap vien");
        return Regex.regexStr(sc.nextLine(),NGAY_THANG_REGEX,"Ngay thang phai theo dinh dang dd/mm/yyyy");
    }
    private String ngayXuatVien(){
        System.out.println("Ngay xuat vien");
        return Regex.regexStr(sc.nextLine(),NGAY_THANG_REGEX,"Ngay thang phai theo dinh dang dd/mm/yyyy");
    }
    private String thoiHanVip(){
        System.out.println("Thoi han goi Vip");
        return Regex.regexStr(sc.nextLine(),NGAY_THANG_REGEX,"Ngay thang phai theo dinh dang dd/mm/yyyy");
    }
}

