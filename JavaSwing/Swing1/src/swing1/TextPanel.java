/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TextPanel extends JPanel {

    TextArea textArea;

    public TextPanel() {
        textArea = new TextArea();

        setLayout(new BorderLayout());

//        add(textArea, BorderLayout.CENTER);
//        Want has scrollbar
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

}
