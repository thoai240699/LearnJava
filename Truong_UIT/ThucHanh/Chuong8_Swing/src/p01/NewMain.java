/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p01;
import javax.swing.JFrame;

/**
 *
 * @author IT
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame gui = new JFrame("Login");
        gui.setVisible(true);
        gui.setSize(500,500);
        
        GUI myGUI = new GUI("Demo Frame");
        myGUI.setVisible(true);
    }
    
}
