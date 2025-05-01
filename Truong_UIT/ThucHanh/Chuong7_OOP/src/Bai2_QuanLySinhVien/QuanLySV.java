/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai2_QuanLySinhVien;

/**
 *
 * @author IT
 */
public class QuanLySV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc lopHoc= new LopHoc("VB2");
        // Cau 1 Khoi tao sv
        lopHoc.initDSSV(null);
        //Cau 2 in thong tin sinh vien
        lopHoc.printDSSV();
        //Cau 3 Xep loai hoc luc cac sv
        lopHoc.xepLoaiDSSV();
        lopHoc.printDSSV();
        //Cau tim diem trung binh lon nhat
        lopHoc.diemMax();
    }
    }
    
