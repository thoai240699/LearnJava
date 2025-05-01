/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV_final;

/**
 *
 * @author IT
 */
public class NVBH extends NhanVien {
    private int soSP;
    
    public NVBH(int maNV, String hoTen, double luongCB) {
        super(maNV, hoTen, luongCB);
        this.soSP=0;
    }
    @Override
    public String toString(){
        return super.toString()+"\tsoSP: %d".formatted(this.soSP);
    }

    @Override
    public void tinhLuong() {
     this.luongHT=luongCB+this.soSP*18000;
    }

    @Override
    public double xetThuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
