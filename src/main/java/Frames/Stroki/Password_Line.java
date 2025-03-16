package Frames.Stroki;

import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Password_Line implements StrokaVVoda{
    JTextField jTextField = new JTextField(20);

    public Password_Line(){

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
