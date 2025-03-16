package Frames.Stroki;

import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Name_Line implements StrokaVVoda{

    JTextField jTextField = new JTextField(20);

    public Name_Line(){

    }
    String input;

    public JTextField getg(){
        return jTextField;
    }

    @Override
    public String getjTextField(){
        input = jTextField.getText();
        return input;
    }
}
