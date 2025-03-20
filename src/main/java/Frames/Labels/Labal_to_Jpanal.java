package Frames.Labels;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Labal_to_Jpanal {
    private final Show_Tasks showTasks;
    private final Get_Build getBuild;
    private final Getting_JPanal gettingJPanal;

    public Labal_to_Jpanal(Show_Tasks showTasks, Get_Build getBuild, Getting_JPanal gettingJPanal) {
        this.showTasks = showTasks;
        this.getBuild = getBuild;
        this.gettingJPanal = gettingJPanal;
    }

    public JPanel setLabel(){
        JLabel jLabel = showTasks.getLabel();
        gettingJPanal.setLabel(jLabel);
        return gettingJPanal.getjPanel();
    }

}
