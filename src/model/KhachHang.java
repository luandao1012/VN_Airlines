package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class KhachHang {
    private String makh, ten, ngaysinh, diachi, mahochieu, sdt, tendangnhap, matkhau;

    public KhachHang() {
    }

    public KhachHang(String makh, String ten, String ngaysinh, String diachi, String mahochieu, String sdt, String tendangnhap, String matkhau) {
        this.makh = makh;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mahochieu = mahochieu;
        this.sdt = sdt;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMahochieu() {
        return mahochieu;
    }

    public void setMahochieu(String mahochieu) {
        this.mahochieu = mahochieu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    
}
