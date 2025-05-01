/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XetTN_KeThua_DongGoi;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class Test {

    /**

     */
    public static void main(String[] args) {
        // TODO code application logic here
        TotNghiep dot1= new TotNghiep("Dot 1 - 2026");
        //1. Tao du lieu SV
        //DS null
        System.out.println("So luong sinh vien: "+dot1.initDSSV(null));
        //add ds
        ArrayList<SV> ds= new ArrayList<>();
        ds.add(new SV1(125,119,6.5,true,60));
        ds.add(new VB2(126,119,9.5,true));
        ds.add(new SV1(127,119,10,false,60));
        ds.add(new VB2(128,119,5,false));
        System.out.println("So luong sinh vien: "+dot1.initDSSV(ds));
        dot1.printDSNV();
        
        System.out.println("Cau 2: Xet tot nghiem");
        dot1.XetTN();
        
        
    }
    
}
