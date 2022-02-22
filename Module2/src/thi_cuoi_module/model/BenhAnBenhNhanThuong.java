package thi_cuoi_module.model;

public class BenhAnBenhNhanThuong extends BenhAn {
    double phiNamVien;

    public BenhAnBenhNhanThuong() {
    }

    public BenhAnBenhNhanThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                                String ngayNhapVien, String ngayXuatVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayXuatVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }


    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                "soThuTu=" + soThuTu +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayXuatVien='" + ngayXuatVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                ", phiNamVien=" + phiNamVien +
                '}';
    }

    public String thongTinBenhNhanThuong(){
        return super.thongTinBenhNhan()+","+this.phiNamVien;
    }
}
