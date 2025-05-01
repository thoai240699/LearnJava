/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTN_KeThua_DongGoi;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class TotNghiep {
    public String dotXet;
    private ArrayList<SV> ds;

    public TotNghiep(String dotXet) {
        this.dotXet = dotXet;
        this.ds = new ArrayList<>();
    }
    //Khoi tao du lieu Sinh VIen
    public int initDSSV(ArrayList ds){
        if(ds==null){
            this.ds.add(new SV1(123,119,6.5,true,60));
            this.ds.add(new VB2(124,119,9.5,true));
        }
        else
            this.ds.addAll(ds);
        return this.ds.size();
    }

    public void printDSNV() {
        for(SV sv:ds)
            System.out.println(sv);
    }

    public void XetTN() {
        for(SV sv:ds)
            sv.XetTN();
    }
    
}
