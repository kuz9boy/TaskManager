package Frames.Stroki.For_Second_Frame;

import Frames.Stroki.StrokaVVoda;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Stroka_for_deadline implements StrokaVVoda {
    JTextField jTextField = new JTextField(20);

    public Stroka_for_deadline(){

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
