/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1_giaiphuongtrinh;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author IT
 */
public class bai1_giaiphuongtrinh {

    /**
        *1. Giải phương trình bậc nhất aX + b = 0
   2. Giải phương trình bậc 2 aX

   2 + bX + c = 0
   3. Giải phương trình trùng phương aX

   4 + bX2 + c = 0

   4. Chương trình kiểm tra số nguyên tố
   5. In ra dãy số nguyên tố bé hơn N 

   Chú ý:
   • Tất cả các bài được thiết kế theo phương pháp hướng đối tượng.
        * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhuongTrinhBat1 pt1=new PhuongTrinhBat1(3.5, 6);
        pt1.prinPT();
        pt1.giai();
        System.out.println("X = "+pt1.getX());
        
        
    }
    
}
