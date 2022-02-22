package thi_cuoi_module.controller;

import thi_cuoi_module.service.benh_nhan_service_impl.BenhNhanServiceImpl;
import thi_cuoi_module.service.benh_nhan_service_impl.BenhNhanThuongServiceImpl;
import thi_cuoi_module.service.benh_nhan_service_impl.BenhNhanVipServiceImpl;

import java.util.Scanner;

public class QuanLyBenhNhan {
    private static final BenhNhanThuongServiceImpl benhNhanThuong = new BenhNhanThuongServiceImpl();
    private static final BenhNhanVipServiceImpl benhNhanVip = new BenhNhanVipServiceImpl();
    private static final BenhNhanServiceImpl benhNhan = new BenhNhanServiceImpl();
    Scanner sc = new Scanner(System.in);
    public void hienThiMenuChinh() {
        System.out.println("-----Quan ly benh nhan-----");
        boolean flag;
        do {
            flag = true;
            System.out.println();
            System.out.println("-----Menu-----\n" +
                    "1.\tThem\n" +
                    "2.\tXoa\n" +
                    "3.\tXem danh sach benh nhan\n" +
                    "4.\tExit.");
            int luaChonMenu;
            while (true) {
                try {
                    System.out.println();
                    System.out.print("nhap lua chon: ");
                    luaChonMenu = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (luaChonMenu) {
                case 1:
                    themMoiBenhNhan();
                    break;
                case 2:
                    xoaBenhNhan();
                    break;
                case 3:
                    hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Cam on!");
                    flag = false;
                    break;
                default:
                    System.out.println("vui long chon 1-4\n");
            }
        } while (flag);
    }

    private void themMoiBenhNhan() {
        System.out.println("------Them moi------\n" +
                "1.\tThem benh nhan thuong\n" +
                "2.\tThem benh nhan vip\n");
        int luaChonMenuThem;
        boolean flag;
        do {
            flag = false;
            while (true) {
                try {
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    luaChonMenuThem = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (luaChonMenuThem) {
                case 1:
                    benhNhanThuong.them();
                    System.out.println("Them benh nhan thuong moi thanh cong\n");
                    break;
                case 2:
                    benhNhanVip.them();
                    System.out.println("Them moi benh nhan vip thanh cong\n");
                    break;
                default:
                    System.out.println("Vui long chon 1 hoac 2\n");
                    flag = true;
            }
        } while (flag);
    }

    private void xoaBenhNhan() {
        while (true) {
            try {
                System.out.println();
                System.out.print("Vui long nhap ma benh an cua benh nhan muon xoa ");
                String maBenhAnXoa = sc.nextLine();
                benhNhan.xoa(maBenhAnXoa);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    private void hienThiDanhSach() {
        benhNhan.hienThi();
    }

}
