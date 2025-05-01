/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong7_OOP;

/**
 *
 * @author IT
 */
public class SinhVien {
    public int maSV;
    public String hoTen;
    public double diemTB;
    //Constructor
    
//    public  SinhVien()
//    {
//    }
//    
//    public SinhVien(int maSV, String hoTen)
//    {
//        this.maSV=maSV;
//        this.hoTen=hoTen;
//    }
//    public SinhVien(int maSV, String hoTen, float diemTB)
//    {
//        this.maSV=maSV;
//        this.hoTen=hoTen;
//        this.diemTB=diemTB;
//    }
//    // Overloading Nap chong (So luong tham so, vi tri tham so, kieu du lieu)
//    public SinhVien(int maSV,float diemTB ,String hoTen)
//    {
//        this.maSV=maSV;
//        this.hoTen=hoTen;
//        this.diemTB=diemTB;
//    }

    public SinhVien(int maSV, String hoTen, double diemTB ) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }
    public void printSV(){
        System.out.println("In thong tin sinh vien:");
        System.out.println("Ma sinh vien: "+this.maSV);
        System.out.println("Ho ten: "+this.hoTen);
        System.out.println("Diem trung binh: "+this.diemTB);
        System.out.println("Dia chi bien: "+this);
    };
    // Khai bao phuong thuc
 
}

