/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuong09;

//import ConnectDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Chuong09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SQLServerDataSource ds = new SQLServerDataSource();
        
        ds.setUser("sa");
        ds.setPassword("sa");
        //ds.setServerName("HP-LAP\\HP_MSSQLSERVER");
        ds.setServerName("thoai\\SQLEXPRESS");
        ds.setPortNumber(Integer.parseInt("1433"));
        ds.setDatabaseName("TH_QuanLyDeTai");
        
        try {
            Connection con = ds.getConnection();
            System.out.println(con);
        } catch (SQLServerException ex) {
            //Logger.getLogger(ConnectDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
