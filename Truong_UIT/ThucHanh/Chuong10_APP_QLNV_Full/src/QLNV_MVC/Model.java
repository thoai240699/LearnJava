/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV_MVC;

import QLNV_final.CongTy;
/**
 *
 * @author IT
 */
public class Model {
    public CongTy ct;
    public Model(){
        ct=new CongTy("ABC");
    }
    public void connectDBGetData(){
        ct.initDSNV();
    }
}
