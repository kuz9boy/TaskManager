package Frames.Samo_OKNO;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Main_Frame {

   private JFrame frame = new JFrame("Task Manager");


    public void createWindo() {


        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void add_to_Frame(JPanel jPanel){
        frame.add(jPanel);
    }
    public JFrame getFrame(){
        return frame;
    }
}