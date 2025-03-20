package Frames.Constr_For_Frame;

import Frames.Buttons.Button;
import Frames.Labels.Label_INT;
import Frames.Stroki.StrokaVVoda;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@Component
public class Get_Build {


    public Get_Build(){}

    public JButton addButton(Button button) {
        JButton jButton = button.getBut();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.buttomFunction();
            }
        });
        return jButton;
    }


//
    public JLabel addStroku(Label_INT label) {
        JLabel jLabel = new JLabel();
        return jLabel;


    }
    public JTextField addSmth(StrokaVVoda strokaVVoda) {
        return strokaVVoda.getJTextField();
    }

}
