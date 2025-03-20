package Frames.Buttons.Button_for_sec;

import Frames.Additional_Windows.Removing_Window;
import Frames.Buttons.Button;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Button_for_Remove2 implements Button {


    private final JButton button = new JButton("Удалить");
   private final Removing_Window removingWindow;


    public Button_for_Remove2(Removing_Window removingWindow) {
        this.removingWindow = removingWindow;

        button.setSize(200,150);
    }
    @Override
    public void buttomFunction() {

        removingWindow.showDial();
    }

    @Override
    public JButton getBut() {
        return button;
    }


}