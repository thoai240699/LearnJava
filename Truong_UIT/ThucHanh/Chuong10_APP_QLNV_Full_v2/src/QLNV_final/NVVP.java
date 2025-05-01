/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV_final;

import java.util.Scanner;

/**
 *
 * @author IT
 */
public class NVVP extends NhanVien {

    private int soNg;

    public void setSoNg(int soNg) {
        this.soNg = soNg;
    }

    public NVVP(int maNV, String hoTen, double luongCB) {
        super(maNV, hoTen, luongCB);
        this.soNg=0;
    }

    @Override
    public String toString(){
        return super.toString()+"\tSoNgay: %d".formatted(this.soNg);
    }

    @Override
    public void tinhLuong() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        luongHT= luongCB + this.soNg * 150000;
    }

    @Override
    public double xetThuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String getLoaiNhanVien() {
        return "Nhân viên văn phòng: " + this.soNg + " ngày";
    }

}
