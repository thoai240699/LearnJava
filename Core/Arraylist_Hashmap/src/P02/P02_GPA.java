/*
 * Click nbfs://nbhost/SystemfileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemfileSystem/Templates/Classes/Main.java to edit this template
 */



package P02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author IT
 */
public class P02_GPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Anh/chị nhập điểm trung bình (GPA) từ bàn phím. Sau đó thông báo kết xếp 
        hạng học luc:
        • Nếu GPA < 3.5 thì “Hoc luc Kém”
        • Nếu 3.5 ≤ GPA < 5.0 thì “Hoc luc Yếu” 
        • Nếu 5.0 ≤ GPA < 7.0 thì “Hoc luc Trung bình”
        • Nếu 7.0 ≤ GPA < 8.0 thì “Hoc luc Khá”
        • Nếu 8.0 ≤ GPA < 9.0 thì “Hoc luc Giỏi”
        • Nếu 9.0 ≤ GPA ≤ 10 thì “Hoc luc Xuất sắc”
        Mở rộng: random điểm gpa thuộc [0; 10] để test cho nhanh.
        */
        System.out.println("Moi ban nhap GPA: ");
//        Scanner ip= new Scanner(System.in);
        //float gpa=ip.nextFloat();
        //Random rand = new Random();
        float gpa=(float)Math.random()*10;
        System.out.println("GPA: "+gpa);
        if (gpa<3.5f)
            System.out.println("Hoc luc Kem");
        else if(gpa<5.0f)
            System.out.println("Hoc luc Yeu");
        else if(gpa<7.0f)
            System.out.println("Hoc luc Trung binh");
        else if(gpa<8.0f)
            System.out.println("Hoc luc Kha");
        else if(gpa<9.0f)
            System.out.println("Hoc luc Gioi");
        else
            System.out.println("Hoc luc Xuat sac");
        
    }
    
}
