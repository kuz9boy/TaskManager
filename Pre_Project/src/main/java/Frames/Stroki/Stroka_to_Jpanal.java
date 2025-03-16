package Frames.Stroki;

import Frames.Buttons.Button;
import Frames.Buttons.Reg_But;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Stroka_to_Jpanal {

    private final Get_Build getBuild;
    private final Name_Line nameLine;
    private final Getting_JPanal gettingJPanal;

    public Stroka_to_Jpanal(Get_Build getBuild, Name_Line nameLine, Getting_JPanal gettingJPanal) {
        this.getBuild = getBuild;
        this.nameLine = nameLine;
        this.gettingJPanal = gettingJPanal;
    }

    public JPanel getStroka() {
        JPanel jPanel = gettingJPanal.getjPanel();
        JTextField jTextField = nameLine.getg();
        jPanel.add(jTextField);
        return jPanel;


    }
}
