/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuong7_oop_qlnv;

/**
 *
 * @author IT
 */
public class Chuong7_OOP_QLNV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Khoi tao cac nhanh vien
        CongTy a = new CongTy("Cong Ty AAA");
        
        a.initDSNV(null);
        a.printDS();
        //Tinh luong ht
        a.tinhLuongHT();
        //XUat danh sach nhan vien
        a.printDS();
        //Tim nhan vien theo ma
        System.out.println("Nhan vien co ma 125 la "+a.timTheoMaNV(125));
        
        // NV co luong cao nhat
        System.out.println("Nhan vien co luong cao nhat la "+a.timTheoLuongMax());
        
        // NV Ban hang co luong thap nhat
        System.out.println("Nhan vien Ban Hang co luong thap nhat la "+a.timTheoLuongMin());
        
    }
    
}
