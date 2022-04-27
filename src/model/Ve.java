package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Ve {
    private String mav, khachhang, chuyenbay, ghengoi, sanbay;
    private double giave, uudai;

    public Ve() {
    }

    public Ve(String mav, String khachhang, String chuyenbay, String ghengoi, String sanbay, double giave, double uudai) {
        this.mav = mav;
        this.khachhang = khachhang;
        this.chuyenbay = chuyenbay;
        this.ghengoi = ghengoi;
        this.sanbay = sanbay;
        this.giave = giave;
        this.uudai = uudai;
    }

    public String getMav() {
        return mav;
    }

    public void setMav(String mav) {
        this.mav = mav;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public String getChuyenbay() {
        return chuyenbay;
    }

    public void setChuyenbay(String chuyenbay) {
        this.chuyenbay = chuyenbay;
    }

    public String getGhengoi() {
        return ghengoi;
    }

    public void setGhengoi(String ghengoi) {
        this.ghengoi = ghengoi;
    }

    public String getSanbay() {
        return sanbay;
    }

    public void setSanbay(String sanbay) {
        this.sanbay = sanbay;
    }

    public double getGiave() {
        return giave;
    }

    public void setGiave(double giave) {
        this.giave = giave;
    }

    public double getUudai() {
        return uudai;
    }

    public void setUudai(double uudai) {
        this.uudai = uudai;
    }
    
    
}
