package Frames.Buttons;

import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class But_to_Jpanal {
    private final Get_Build getBuild;
    private final Reg_But regBut;
    private final Getting_JPanal gettingJPanal;
    public But_to_Jpanal(Get_Build getBuild, Reg_But regBut,Getting_JPanal gettingJPanal) {
        this.getBuild = getBuild;
        this.regBut = regBut;
        this.gettingJPanal = gettingJPanal;
    }

    public JPanel getButton(BUTTONS buttons) {
        JPanel jPanel = gettingJPanal.getjPanel();
        switch (buttons) {
            case REG_BUTA:

                JButton jButton = getBuild.addButton(regBut);
                jPanel.add(jButton);
                break;
            }




        return jPanel;
    }

}
