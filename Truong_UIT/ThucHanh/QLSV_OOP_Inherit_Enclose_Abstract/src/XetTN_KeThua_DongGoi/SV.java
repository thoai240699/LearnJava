/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTN_KeThua_DongGoi;

/**
 *
 * @author IT
 */
public  class SV {
    protected int maSV;
    protected int soTC;
    private double diemTL;
    private boolean ngoaiN;
    private String xepLoaiTN;
    protected boolean tinhTrangTN;


    public SV(int maSV, int soTC, double diemTL, boolean ngoaiN) {
        this.maSV = maSV;
        this.soTC = soTC;
        this.diemTL = diemTL;
        this.ngoaiN = ngoaiN;
        this.tinhTrangTN = false;
        this.xepLoaiTN = "Chua xep loai";
    }
    public double getDiemTL(){
        return this.diemTL;
    }
    public boolean getNgoaiN()
    {
        return this.ngoaiN;
    }
    @Override
    public String toString() {
        return "[%d, %d, %.2f, %b, %s, %b".formatted(this.maSV,this.soTC,this.diemTL, this.ngoaiN, this.tinhTrangTN, this.xepLoaiTN);
    }

     public void XetTN(){};
    
    
    
    
}
