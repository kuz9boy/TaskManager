package Frames.Stroki.For_First_Frame;

import Frames.Stroki.StrokaVVoda;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Name_Line implements StrokaVVoda {

    JTextField jTextField = new JTextField(20);

    public Name_Line(){

    }
    String input;

    @Override
    public JTextField getJTextField() {
        return jTextField;
    }

    @Override
    public String getText() {
        input = jTextField.getText();
        return input;
    }
}
