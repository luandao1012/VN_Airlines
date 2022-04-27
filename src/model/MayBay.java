package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class MayBay {
    private String mamb, ten, hang, kichthuoc;
    private int gheloai1, gheloai2;

    public MayBay() {
    }

    public MayBay(String mamb, String ten, String hang, String kichthuoc, int gheloai1, int gheloai2) {
        this.mamb = mamb;
        this.ten = ten;
        this.hang = hang;
        this.kichthuoc = kichthuoc;
        this.gheloai1 = gheloai1;
        this.gheloai2 = gheloai2;
    }

    public String getMamb() {
        return mamb;
    }

    public void setMamb(String mamb) {
        this.mamb = mamb;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public int getGheloai1() {
        return gheloai1;
    }

    public void setGheloai1(int gheloai1) {
        this.gheloai1 = gheloai1;
    }

    public int getGheloai2() {
        return gheloai2;
    }

    public void setGheloai2(int gheloai2) {
        this.gheloai2 = gheloai2;
    }
    
    
}
