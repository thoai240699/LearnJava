/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_giaiphuongtrinh;

/**
 *
 * @author IT
 */
public class PhuongTrinhBat1 {
    double a, b, x;

    public PhuongTrinhBat1() {
    }

    public PhuongTrinhBat1(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void prinPT(){
        System.out.println("Phuong Trinh: "+this.a+"X"+this.b);
    };
    
    
    public boolean giai()
    {
        if(a!=0)        
            if(b==0)
                return true;
            else 
            {
                this.x=-this.b/this.a;
                return true;
            }
        return false;
        
    }

    public double getX() {
        return x;
    }
    
    
    
    
    
    
}
