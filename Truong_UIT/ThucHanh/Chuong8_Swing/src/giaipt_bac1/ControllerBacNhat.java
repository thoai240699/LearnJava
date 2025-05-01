/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaipt_bac1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IT
 */
public class ControllerBacNhat {

    public ViewBacNhat view;
    public ModelBacNhat model;
//    public ControllerBacNhat() {
//        view = new ViewBacNhat();
//        model = new ModelBacNhat();
//    }
    public ControllerBacNhat(ViewBacNhat v, ModelBacNhat m) {
        view = v;
        model = m;
    }
    public void giaiPTBacNhat(){
        view.ActionListenerBtnCach2(new A());
    }
    class A implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Giai phuong trinh cach 2: "+ view.getA()+" "+view.getB());
               double kq = -view.getB()/view.getA();
               view.SetKQ(kq);
        }
    }

//    public ControllerBacNhat() {
//        ViewBacNhat bn = new ViewBacNhat();
//        bn.setVisible(true);
//        bn.ActionListenerBtnCach2(new A());
//    }
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        ControllerBacNhat run = new ControllerBacNhat();
//    }

}
