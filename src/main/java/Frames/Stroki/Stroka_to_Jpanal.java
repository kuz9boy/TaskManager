package Frames.Stroki;

import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Stroki.For_First_Frame.Name_Line;
import Frames.Stroki.For_First_Frame.Password_Line;
import Frames.Stroki.For_Second_Frame.*;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Stroka_to_Jpanal {

    private final Get_Build getBuild;
    private final Name_Line nameLine;
    private final Getting_JPanal gettingJPanal;
    private final Password_Line passwordLine;
    private final Removing_stroka removingStroka;
    private final Stroka_for_ADD_task_Name strokaForAddTaskName;
    private final Stroka_for_ADD_task_Discrip strokaForAddTaskDiscrip;
    private final Stroka_for_DATA strokaForData;
    private final Stroka_for_deadline strokaForDeadline;

    public Stroka_to_Jpanal(Get_Build getBuild, Getting_JPanal gettingJPanal,
                            Password_Line passwordLine, Name_Line nameLine,
                            Removing_stroka removingStroka, Stroka_for_ADD_task_Name strokaForAddTaskName,
                            Stroka_for_ADD_task_Discrip strokaForAddTaskDiscrip,
                            Stroka_for_DATA strokaForData, Stroka_for_deadline strokaForDeadline) {
        this.getBuild = getBuild;
        this.gettingJPanal = gettingJPanal;
        this.passwordLine = passwordLine;
        this.nameLine = nameLine;
        this.removingStroka = removingStroka;
        this.strokaForAddTaskName = strokaForAddTaskName;
        this.strokaForAddTaskDiscrip = strokaForAddTaskDiscrip;
        this.strokaForData = strokaForData;
        this.strokaForDeadline = strokaForDeadline;
    }

    public JPanel getStroka(STROKS stroks) {
        switch (stroks) {
            case STROKA_NAME:
                gettingJPanal.setjPanel_strok(nameLine.getJTextField()); // Теперь добавляется в `jPanel`
                break;
            case STROKA_PASSWORD:
                gettingJPanal.setjPanel_strok(passwordLine.getJTextField());
                break;
            case STROKA_FOR_ADD_TASK_NAME:
                gettingJPanal.setjPanel_strok(strokaForAddTaskName.getJTextField());
                break;
            case STROKA_FOR_ADD_TASK_DISC:
                gettingJPanal.setjPanel_strok(strokaForAddTaskDiscrip.getJTextField());
                break;
            case STROKA_FOR_ADD_TASK_DEADLINE:
                gettingJPanal.setjPanel_strok(strokaForDeadline.getJTextField());
                break;
            case STROKA_FOR_ADD_TASK_DATA:
                gettingJPanal.setjPanel_strok(strokaForData.getJTextField());
                break;
            case REMOVING_STROKA:
                gettingJPanal.setjPanel_strok(removingStroka.getJTextField());
                break;
        }
        return gettingJPanal.getjPanel();
    }
}
