/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV_MVC;
/**
 *
 * @author IT
 */
public class Controller {
    public Model m;
    public View v;
    
    public Controller(Model m, View v)
    {
        this.m = m;
        this.v = v;
    }
    public void loadShowDSNV(){
        m.connectDBGetData();
        View.printDSNV(m.ct.ds);
    }
    public void tinhLuongNV(){
        m.ct.tinhLuongHT();
    }
}
