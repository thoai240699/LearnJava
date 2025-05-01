/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong7_oop_static;

import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class Diem {

    
    public double x,y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.1f; %.1f)", this.x,this.y);
        //return "(%.1f; %.1f)".formatted(this.x,this.y);
    }
    public void printDiem()
    {
        System.out.println(this);
    }
    public static void funcA(){
        System.out.println("static");
    }
    public static double khoangCach(Diem a,Diem b)
    {
       return Math.sqrt(Math.pow((a.x - b.x), 2)+Math.pow((a.y-b.y), 2));
       
    }
    static Diem timDiemXaTamO(ArrayList<Diem> d) {
        if (d.isEmpty()) {
            System.out.println("\nDanh Sach Rong!");
            return null;
        }

        Diem xaNhat = d.get(0);
        double maxKhoangCach = khoangCach(xaNhat, new Diem(0, 0));

        for (Diem p : d) {
            double kc = khoangCach(p, new Diem(0, 0));
            if (kc > maxKhoangCach) {
                maxKhoangCach = kc;
                xaNhat = p;
            }
        }

        return xaNhat;
    }
    
    
    
}
