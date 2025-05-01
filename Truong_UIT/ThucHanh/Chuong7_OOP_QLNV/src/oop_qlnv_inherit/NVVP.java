/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_qlnv_inherit;

import java.util.Scanner;

/**
 *
 * @author IT
 */
public class NVVP extends NhanVien {

    private int soNg;

    public NVVP(int maNV, String hoTen, double luongCB) {
        super(maNV, hoTen, luongCB);
    }

//    public void setSoNg() {
//        Scanner input = new Scanner(System.in);
//        String password;
//        System.out.print("Please enter the admin password: ");
//        password = input.nextLine();
//        if (!password.equals("123")) 
//            System.out.println("Invalid password");
//        else{ 
//            System.out.print("Please enter soNg: ");
//            this.soNg=input.nextInt();
//        }
//    }
    @Override
    public String toString(){
        super.toString();
        
    }

}
