package Frames.Constr_For_Frame;

import Frames.Buttons.Button;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@Component
public class Get_Build {


    public Get_Build(){}

    public JButton addButton(Button button) {
        JButton jButton = new JButton("Click me!");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.buttomFunction();
            }
        });
        return jButton;
    }
}

//
//    public JLabel addStroku(Label label) {
//        JLabel jLabel = new JLabel();
//        return jLabel;
//
//
//    }
//
//
//    public JTextField addSmth(StrokaVVoda strokaVVoda) {
//        JTextField jTextField = new JTextField(20);
//
//
//
//        return jTextField;
//    }


