/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

/**
 *
 * @author IT
 */
public class MainFrame extends JFrame {
//    private JTextArea textArea;

    private TextPanel textPanel;
//    private JButton btn;
    private Toolbar toolbar;

    public MainFrame() {
        super("Hello World");
        setLayout(new BorderLayout());
//        textArea = new JTextArea();
        textPanel = new TextPanel();
//        btn = new JButton("Chọn");
        toolbar = new Toolbar();
//        add(textArea, BorderLayout.CENTER);
        add(textPanel, BorderLayout.CENTER);
//        add(btn, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);
        toolbar.setTextPanel(textPanel);
        
        // btn Change to Toolbar class
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                textArea.append("Xin chào\n");
//                textPanel.appendText("Xin chào\n");
//            }
//        });

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //calling system.exit(0) to terminate program
        setVisible(true);
    }

}
