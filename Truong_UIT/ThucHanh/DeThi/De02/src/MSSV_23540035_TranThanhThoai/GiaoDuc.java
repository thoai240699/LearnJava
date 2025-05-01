/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

/**
 *
 * @author IT
 */
public class GiaoDuc extends CongTy{
    private double tongThu;
    public GiaoDuc(String maCT, double vonDH, double thue, double tongThu) {
        super(maCT, vonDH, thue);
        this.tongThu=tongThu;
    }
            @Override
    public void xetDTCT() {
        
        if(this.vonDH > this.tongThu)
        {
            this.xetDoanhThu="KhongDat";
            return;
        }
        else if(this.tongThu*this.thue > 10){
            this.xetDoanhThu="Vuot";
            return;
        }
        else this.xetDoanhThu="Dat";
    }
    
    
}
