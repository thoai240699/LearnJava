/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing7;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame() {
        super("Hello World");
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        toolbar = new Toolbar();
        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);
//        toolbar.setTextPanel(textPanel);
        toolbar.setStringListener(new StringListener(){
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
            
        });

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //calling system.exit(0) to terminate program
        setVisible(true);
    }

}
