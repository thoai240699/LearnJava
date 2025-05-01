/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuong7_oop_static;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class Chuong7_OOP_static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diem a=new Diem(0,0), b=new Diem(3.65,8.399);
        Diem c=new Diem(9.3, 2);
        System.out.println(c);
        Diem.funcA();//Ham tinh nam ngoai doi tuong
        System.out.print("khoang cach: "+Diem.khoangCach(a, b));
        
        ArrayList<Diem> d=new ArrayList<>();
        Diem m =Diem.timDiemXaTamO(d);
        
    }
    
}
