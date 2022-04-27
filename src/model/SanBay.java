package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SanBay {
    private String masb, ten, diachi;

    public SanBay() {
    }

    public SanBay(String masb, String ten, String diachi) {
        this.masb = masb;
        this.ten = ten;
        this.diachi = diachi;
    }

    public String getMasb() {
        return masb;
    }

    public void setMasb(String masb) {
        this.masb = masb;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
