/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author IT
 */
public class Toolbar extends JPanel implements ActionListener {

    private Toolbar toolbar;
    private JButton helloButton;
    private JButton goodByeButton;
    private TextPanel textPanel;
    private StringListener textListener;

    public Toolbar() {
        helloButton = new JButton("Xin chào");
        goodByeButton = new JButton("Tạm biệt");

        helloButton.addActionListener(this);
        goodByeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodByeButton);
    }

//    public void setTextPanel(TextPanel textPanel) {
//        this.textPanel = textPanel;
//    }
    public void setStringListener(StringListener textListener) {
        this.textListener = textListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("A button has been clicked");
        JButton click = (JButton) e.getSource();
        if (click == helloButton) {
            if (textListener != null) {
//            textPanel.appendText("Hello\n");
                textListener.textEmitted("Xin chào\n");
            }
        } else {
            if (textListener != null) {
                textListener.textEmitted("Tạm biệt\n");
            }
        }
    }

}
