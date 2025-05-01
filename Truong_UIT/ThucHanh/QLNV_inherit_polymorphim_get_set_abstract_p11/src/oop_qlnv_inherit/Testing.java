/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_qlnv_inherit;

/**
 *
 * @author IT
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Khoi tao cac nhanh vien
        CongTy a = new CongTy("Cong Ty AAA");
        
        a.initDSNV(null);
        a.printDS();
//        //Tinh luong ht
        a.tinhLuongHT();
//        //XUat danh sach nhan vien
        a.printDS();
        //Tim nhan vien theo ma
        int maNV=999;
        System.out.println("Nhan vien("+ maNV +") :"+(a.timTheoMaNV(maNV)!=null ? a.timTheoMaNV(maNV): "khong tim thay"));
//        
//        // NV co luong cao nhat
        
        System.out.println("Nhan vien co luong cao nhat la "+a.timTheoLuongMax());
        
//        // NV Ban hang co luong thap nhat
//        System.out.println("Nhan vien Ban Hang co luong thap nhat la "+a.timTheoLuongMin());
//        
    }
    
}

