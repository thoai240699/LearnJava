/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

/**
 *
 * @author IT
 */
public class VanTai extends CongTy{
    private double tongThu;
    private double chiPhiXe;
//    public VanTai(String maCT, double vonDH, double thue, double tongThu,double chiPhiXe) {
//        super(maCT, vonDH, thue);
//        this.chiPhiXe = chiPhiXe;
//        this.tongThu = tongThu;
//        
//    }
    public VanTai(double tongThu, double chiPhiXe, String maCT, double vonDH, double thue) {
        
        super(maCT, vonDH, thue);
        this.tongThu = tongThu;
        this.chiPhiXe = chiPhiXe;
    }

    @Override
    public void xetDTCT() {
        if(this.vonDH < this.tongThu)
        {
            this.xetDoanhThu="KhongDat";
            return;
        }
        else if(this.chiPhiXe*this.thue > this.tongThu){
            this.xetDoanhThu="Vuot";
            return;
        }
        else this.xetDoanhThu="Dat";
    }
    
}
