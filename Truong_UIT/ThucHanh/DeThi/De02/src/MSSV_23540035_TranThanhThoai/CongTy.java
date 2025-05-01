/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

/**
 *
 * @author IT
 */
public abstract class CongTy {
    protected String maCT;
    protected double vonDH;
    protected double thue;
    public String xetDoanhThu;

    public CongTy(String maCT, double vonDH, double thue) {
        this.maCT = maCT;
        this.vonDH = vonDH;
        this.thue = thue;
        this.xetDoanhThu = "chua xet";
    }
    @Override
    public String toString(){
        return "MaCT: %s\tVonDH: %f".formatted(this.maCT, this.vonDH);
    }
    
    public abstract void xetDTCT();
    
    
}

