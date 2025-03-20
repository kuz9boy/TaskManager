package Frames.Buttons.Button_for_sec;

import Frames.Additional_Windows.Additional_Window;
import Frames.Buttons.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Buttom_add_task implements Button {
    JButton button = new JButton("Добавить задание");
    private Additional_Window additionalWindow;

    @Autowired
    public Buttom_add_task(Additional_Window additionalWindow) {
        this.additionalWindow = additionalWindow;
        button.setSize(200, 150);
    }

    @Override
    public void buttomFunction() {
        additionalWindow.showDial();
    }

    @Override
    public JButton getBut() {
        return button;
    }
}
