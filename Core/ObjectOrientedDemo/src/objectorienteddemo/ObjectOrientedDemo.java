/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectorienteddemo;

/**
 *
 * @author IT
 */
public class ObjectOrientedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Staff staff1 = new Staff("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);
        
        Staff staff2 = new Staff("Jane", "Lee");
        staff2.setHoursWorked(160);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
        
        System.out.println("\n\nUpdating Jane's Hours Worked to -10");       
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked =  "+ staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
    }

}
