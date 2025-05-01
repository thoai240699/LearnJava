/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QLNV_MVC;

import javax.management.modelmbean.ModelMBeanInfo;

/**
 *
 * @author IT
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model m = new Model();
        View v= new View();
        Controller c=new Controller(m, v);
        c.loadShowDSNV();
        c.tinhLuongNV();
        c.loadShowDSNV();
    }
    
}
