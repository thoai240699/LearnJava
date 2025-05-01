/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaipt_bac1;

/**
 *
 * @author IT
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewBacNhat v = new ViewBacNhat();
        v.setVisible(true);
        ModelBacNhat m = new ModelBacNhat();
        ControllerBacNhat c = new ControllerBacNhat(v, m);
        c.giaiPTBacNhat();
        
    }
    
}
