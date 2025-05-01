/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p01;

import javax.swing.JFrame;

/**
 *
 * @author IT
 */
public class GUI extends JFrame{
    public int cao = 500;
    public int rong = 500;
    public GUI(String title){
        initGUI(title);
        
    }
    private void initGUI(String title){
        setTitle(title);
        setSize(rong,cao);
        setResizable(false);
    }
    
}
