/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_qlnv_inherit;

/**
 *
 * @author IT
 */
public abstract class NhanVien {

    protected int maNV;
    protected String hoTen;
    protected double luongCB;
    protected double luongHT;
    
    public NhanVien(int maNV, String hoTen, double luongCB)
    {
        this.maNV=maNV;
        this.hoTen=hoTen;
        this.luongCB=luongCB;
        this.luongHT=0;
    }
    public int getMaNV(){
        return this.maNV;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public double getLuongCB(){
        return this.luongCB;
    }
    public double getLuongHT(){
        return this.luongHT;
    }
    
    
    public void setLuongHT(double luongHT){
        this.luongHT=luongHT;
    }

    @Override
    public String toString(){
        return "maNV: %d\tHoTen: %S\tLuongCB: %.2f\tLuongHT: %.2f".formatted(this.maNV,this.hoTen,this.luongCB,this.luongHT);
    }
    abstract public void tinhLuong();
    abstract public double xetThuong();
    
}
