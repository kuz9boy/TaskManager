package Frames.Stroki.For_Second_Frame;

import Frames.Stroki.StrokaVVoda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Removing_stroka implements StrokaVVoda {

   private final JTextField jTextField = new JTextField(20);

    public Removing_stroka(){

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
