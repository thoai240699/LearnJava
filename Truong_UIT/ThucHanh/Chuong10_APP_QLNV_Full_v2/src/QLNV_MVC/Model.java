package QLNV_MVC;

import ConnDB.MSSQLServer;
import QLNV_final.Luong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Model {

    public Luong luong;

    public Model() {
        this.luong = new Luong();
        this.luong.initDSNV();
        MSSQLServer mssqls = new MSSQLServer();
    }

    public ArrayList<Object[]> getNhanVienData() {
        ArrayList<Object[]> data = new ArrayList<>();
        String query = "SELECT nv.MaNhanVien, nv.HoTen, ccth.LoaiNhanVien, nv.LuongCoBan, nv.LuongHT, ccth.SoNgayLam, ccth.SoSanPham "
                + "FROM NhanVien nv "
                + "LEFT JOIN ChamCongTongHop ccth ON nv.MaNhanVien = ccth.MaNhanVien";

        try (Connection con = new MSSQLServer().getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("Executing query: " + query);
            while (rs.next()) {
                Object[] row = {
                        rs.getString("MaNhanVien"), // Fetch as String
                        rs.getString("HoTen"),
                        rs.getString("LoaiNhanVien"),
                        rs.getDouble("LuongCoBan"),
                        rs.getDouble("LuongHT"), // Fetch LuongHT
                        rs.getInt("SoNgayLam"),
                        rs.getInt("SoSanPham")
                };
                data.add(row);
            }
            System.out.println("Query executed successfully. Rows fetched: " + data.size());
        } catch (Exception e) {
            System.err.println("Error while fetching data: " + e.getMessage());
            e.printStackTrace();
        }

        return data;
    }

public void calculateAndSaveLuongHT() {
    String selectQuery = "SELECT nv.MaNhanVien, nv.LuongCoBan, ccth.SoNgayLam, ccth.SoSanPham "
                       + "FROM NhanVien nv "
                       + "LEFT JOIN ChamCongTongHop ccth ON nv.MaNhanVien = ccth.MaNhanVien";
    String updateQuery = "UPDATE NhanVien SET LuongHT = ? WHERE MaNhanVien = ?";

    try (Connection con = new MSSQLServer().getConnection();
         PreparedStatement selectPs = con.prepareStatement(selectQuery);
         PreparedStatement updatePs = con.prepareStatement(updateQuery);
         ResultSet rs = selectPs.executeQuery()) {

        while (rs.next()) {
            String maNhanVien = rs.getString("MaNhanVien");
            double luongCoBan = rs.getDouble("LuongCoBan");
            int soNgayLam = rs.getInt("SoNgayLam");
            int soSanPham = rs.getInt("SoSanPham");

            // Calculate LuongHT
            double luongHT = luongCoBan + (soNgayLam * 150000) + (soSanPham * 18000);

            // Update LuongHT in the database
            updatePs.setDouble(1, luongHT);
            updatePs.setString(2, maNhanVien);
            updatePs.executeUpdate();
        }

        System.out.println("Lương hàng tháng đã được tính và cập nhật thành công.");
    } catch (Exception e) {
        System.err.println("Lỗi khi tính lương: " + e.getMessage());
        e.printStackTrace();
    }
}
    }

