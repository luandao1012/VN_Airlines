/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.MayBay;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class MayBayDAO extends DBConnect{

    public MayBayDAO() {
    }
    
    public List<MayBay> getAll(){
        List<MayBay> list = new ArrayList<>();
        String sql = "SELECT * FROM MayBay";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                MayBay mb = new MayBay();
                mb.setMamb(rs.getString("MaMB"));
                mb.setTen(rs.getString("Ten"));
                mb.setHang(rs.getString("Hang"));
                mb.setKichthuoc(rs.getString("KichThuoc"));
                mb.setGheloai1(rs.getInt("GheLoai1"));
                mb.setGheloai2(rs.getInt("GheLoai2"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        MayBayDAO m = new MayBayDAO();
        List<MayBay> list = m.getAll();
        System.out.println(list.get(0).getMamb());
    }
}
