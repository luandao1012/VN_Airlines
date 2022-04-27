/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class NhanVien {
    private String manv, sanbay, ten, ngaysinh, diachi, vitri, sdt;
    private int bacluong;

    public NhanVien() {
    }

    public NhanVien(String manv, String sanbay, String ten, String ngaysinh, String diachi, String vitri, String sdt, int bacluong) {
        this.manv = manv;
        this.sanbay = sanbay;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.vitri = vitri;
        this.sdt = sdt;
        this.bacluong = bacluong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getSanbay() {
        return sanbay;
    }

    public void setSanbay(String sanbay) {
        this.sanbay = sanbay;
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

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getBacluong() {
        return bacluong;
    }

    public void setBacluong(int bacluong) {
        this.bacluong = bacluong;
    }
    
    
}
