package thi_cuoi_module.model;

public class BenhAnBenhNhanVip extends BenhAn {
    String goiVip;
    String thoiHanVip;

    public BenhAnBenhNhanVip() {
    }

    public BenhAnBenhNhanVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien,
                             String ngayXuatVien, String lyDoNhapVien, String goiVip, String thoiHanVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayXuatVien, lyDoNhapVien);
        this.goiVip = goiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getGoiVip() {
        return goiVip;
    }

    public void setGoiVip(String goiVip) {
        this.goiVip = goiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" +
                "soThuTu=" + soThuTu +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayXuatVien='" + ngayXuatVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                ", goiVip='" + goiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }

    public String thongTinBenhNhanVip(){
        return super.thongTinBenhNhan()+","+this.goiVip+","+this.thoiHanVip;
    }
}
