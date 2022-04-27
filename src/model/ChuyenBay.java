package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class ChuyenBay {
    private String macb, maybay, dxp, diemden, tgbatdau, tgketthuc;

    public ChuyenBay() {
    }

    public ChuyenBay(String macb, String maybay, String dxp, String diemden, String tgbatdau, String tgketthuc) {
        this.macb = macb;
        this.maybay = maybay;
        this.dxp = dxp;
        this.diemden = diemden;
        this.tgbatdau = tgbatdau;
        this.tgketthuc = tgketthuc;
    }

    public String getMacb() {
        return macb;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String getMaybay() {
        return maybay;
    }

    public void setMaybay(String maybay) {
        this.maybay = maybay;
    }

    public String getDxp() {
        return dxp;
    }

    public void setDxp(String dxp) {
        this.dxp = dxp;
    }

    public String getDiemden() {
        return diemden;
    }

    public void setDiemden(String diemden) {
        this.diemden = diemden;
    }

    public String getTgbatdau() {
        return tgbatdau;
    }

    public void setTgbatdau(String tgbatdau) {
        this.tgbatdau = tgbatdau;
    }

    public String getTgketthuc() {
        return tgketthuc;
    }

    public void setTgketthuc(String tgketthuc) {
        this.tgketthuc = tgketthuc;
    }
    
    
}
