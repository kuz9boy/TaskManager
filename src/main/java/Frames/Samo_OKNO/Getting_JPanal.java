package Frames.Samo_OKNO;

import Frames.Buttons.Button;
import Frames.Labels.Label_INT;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Getting_JPanal {
    private final JPanel jPanel = new JPanel();
    public JPanel getjPanel(){
        return jPanel;
    }

    public JPanel setjPanel_but(JButton button){
        jPanel.add(button);
        return jPanel;
    }
    public JPanel setLabel(JLabel label){
        jPanel.add(label);
        return jPanel;
    }
    public JPanel setjPanel_strok(JTextField jTextField) {
        jPanel.add(jTextField);
        jPanel.revalidate();
        jPanel.repaint();
        return jPanel;
    }



    public void clearJpanal(){
        jPanel.removeAll();

    }

}
