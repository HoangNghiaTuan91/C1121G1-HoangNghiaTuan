package thi_cuoi_module.service.benh_nhan_service_impl;

import thi_cuoi_module.model.BenhAn;
import thi_cuoi_module.model.BenhAnBenhNhanThuong;
import thi_cuoi_module.model.BenhAnBenhNhanVip;
import thi_cuoi_module.service.BenhNhanService2;
import thi_cuoi_module.util.CodeNotFound;
import thi_cuoi_module.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class BenhNhanServiceImpl implements BenhNhanService2 {
    public static final String DUONG_DAN_FILE = "src/thi_cuoi_module/data/benhnhan.csv";
    Scanner sc = new Scanner(System.in);
    List<BenhAn> benhNhanList = ReadAndWrite.readBenhNhanFromCSVFile(DUONG_DAN_FILE);
    @Override
    public void xoa(String maBenhAn) {
        try {
            int index = 0;
            List<BenhAn> benhNhanList = ReadAndWrite.readBenhNhanFromCSVFile(DUONG_DAN_FILE);
            boolean check = false;
            for (int i = 0; i < benhNhanList.size(); i++) {
                if (benhNhanList.get(i).getMaBenhAn().equals(maBenhAn)) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                boolean flag = false;
                do {
                    flag = false;
                    int luaChonXoa = 0;
                    try {
                        System.out.println("Xac nhan xoa");
                        System.out.println("1\tYes");
                        System.out.println("2\tNo");
                        luaChonXoa = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    switch (luaChonXoa) {
                        case 1:
                            benhNhanList.remove(index);
                            System.out.println("Danh sach benh nhan ");
                            System.out.println(benhNhanList);
                            ReadAndWrite.writeListToCSVFile(benhNhanList,DUONG_DAN_FILE,false);
                            break;
                        case 2:
                            break;
                        default:
                            flag = true;
                            System.out.println("Vui long chon 1 hoac 2");
                    }
                } while (flag);
            } else {
                CodeNotFound.CodeNotFound();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hienThi() {
        if (benhNhanList.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("-----Danh sach benh nhan-----");
            for (BenhAn benhNhan : benhNhanList) {
                System.out.println("STT " + benhNhan.getSoThuTu());
                System.out.println("Ma benh an " + benhNhan.getMaBenhAn());
                System.out.println("Ma benh nhan " + benhNhan.getMaBenhNhan());
                System.out.println("Ten benh nhan " + benhNhan.getTenBenhNhan());
                System.out.println("Ngay nhap vien " + benhNhan.getNgayNhapVien());
                System.out.println("Ngay xuat vien " + benhNhan.getNgayXuatVien());
                System.out.println("Ly do nhap vien " + benhNhan.getLyDoNhapVien());
                if (benhNhan instanceof BenhAnBenhNhanThuong) {
                    System.out.println("Phi nam vien " + ((BenhAnBenhNhanThuong) benhNhan).getPhiNamVien());
                    System.out.println("----------");
                } else if (benhNhan instanceof BenhAnBenhNhanVip) {
                    System.out.println("Goi vip " + ((BenhAnBenhNhanVip) benhNhan).getGoiVip());
                    System.out.println("Thoi han vip " + ((BenhAnBenhNhanVip) benhNhan).getThoiHanVip());
                    System.out.println("----------");
                }
            }
        }
    }
}
