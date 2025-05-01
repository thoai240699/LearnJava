/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong7_OOP;

/**
 *
 * @author IT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien();
        
        SinhVien sv1=new SinhVien(123,"Nguyen Van B",9.6);
        
        sv.printSV();
        sv1.printSV();
        
    }
    
}
