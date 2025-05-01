/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

/**
 *
 * @author IT
 */
public class BDS extends CongTy{
    private int soCH;
    private double giaCH;

    public BDS(String maCT, double vonDH, double thue, int soCH, double giaCH) {
        super(maCT, vonDH, thue);
        this.soCH = soCH;
        this.giaCH = giaCH;
    }

    @Override
    public void xetDTCT() {
        
        if((this.vonDH - this.soCH*this.giaCH - this.giaCH*this.thue)<0)
        {
            this.xetDoanhThu="Vuot";
            return;
        }
        else if((this.vonDH - this.soCH*this.giaCH)>50){
            this.xetDoanhThu="Dat";
            return;
        }
        else this.xetDoanhThu="KhongDat";
    }
    



    
    
}
