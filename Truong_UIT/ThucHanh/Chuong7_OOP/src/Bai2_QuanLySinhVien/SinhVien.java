/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_QuanLySinhVien;

/**
 *
 * @author IT
 */
public class SinhVien {

    int maSV;
    String hoTen;
    double diemTB;
    String hocLuc;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return String.format("MaSV: %d\tHo va Ten: %s\tDiemTB: %.2f\tXep Loai: %s\n", maSV, hoTen, diemTB, hocLuc);

    }

//    public void printSV() {
//        System.out.println("MaSV: " + this.maSV);
//        System.out.println("HovaTen: " + this.hoTen);
//        System.out.println("DiemTB: " + this.diemTB);
//        System.out.println("XepLoai: " + this.hocLuc);
//    }
    public void printSV() {
        System.out.print(this);
    }
    public void xepLoaiSV() {
        
        if (diemTB < 5) {
            this.hocLuc = "Kem";
        } else if (diemTB < 8) {
            this.hocLuc = "Trung Binh";
        } else {
            this.hocLuc = "Gioi";
        }

    }

}
