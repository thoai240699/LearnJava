/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong7_oop_qlnv;

/**
 *
 * @author IT
 */
public class NVVP {

    int maNV;
    String hoTen;
    double luongCB;
    double luongHT;
    int soNg;

    public NVVP(int maNV, String hoTen, double luongCB) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.luongHT = 0;
        //this.soNg = soNg;
        
    }

    @Override
    public String toString() {
        return "maNV: %d\tHoTen: %S\tLuongCB: %.2f\tLuongHT: %.2f\t soNg: %d".formatted(this.maNV,this.hoTen,this.luongCB,this.luongHT,this.soNg);
    }
    
    public void tinhLuong()
    {
        this.luongHT=luongCB+this.soNg*150000;
    }
    public double getLuongHT()
    {
        return this.luongHT;
    }
}
