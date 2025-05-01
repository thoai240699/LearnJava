/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

/**
 *
 * @author IT
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Yeu cau 1: Khoi tao du lieu cong ty cho tong cong ty
        tongCT abc = new tongCT("MVC");
        abc.initDSCT();
        abc.printDS();
        //Yeu cau 2 Xet Doaanh Thu
        abc.xetDT();
    }
    
}
