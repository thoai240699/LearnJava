/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MSSV_23540035_TranThanhThoai;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class tongCT implements InterfaceTongCT{
    public String tenCT;
    ArrayList<CongTy> ds;
    public tongCT(String tenCT) {
        this.tenCT = tenCT;
        this.ds = new ArrayList<>();
    }
    public void initDSCT(){
        ds.add(new BDS("B111", 108.5, 0.19, 65, 1.3));
        ds.add(new BDS("B112", 158.6, 0.15, 50, 1.2));
        ds.add(new BDS("B113", 130.8, 0.02, 67, 1.1));
        ds.add(new VanTai("V201", 50.9, 0.06, 61.1, 30.1));
        ds.add(new VanTai("V201", 80.5, 0.08, 71.1, 0));
        ds.add(new GiaoDuc("G301", 39.3, 0.02, 30.2));
        ds.add(new GiaoDuc("G302", 59.2, 0.03, 65.6));
    }
    public void printDS(){
        for(CongTy ct:ds)
            System.out.println(ct);
    }

    public void xetDT() {
          for(CongTy ct:ds){
            ct.xetDTCT();
              System.out.println(ct);
              System.out.println("xet "+ ct.xetDoanhThu);
          }
    }

    
}
