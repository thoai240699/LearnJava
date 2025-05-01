/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D02_ThucThi;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.CallableStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ThucThi {
    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:sqlserver://thoai:1433;"
                    + "databaseName=TH_QuanLyDeTai;user=sa;password=sa";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
            CallableStatement cstmt = conn.prepareCall("SELECT * from GIAOVIEN");
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getString("MSGV") + ", " + rs.getString("TENGV"));
                //System.out.println();
            }
            
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
}
