package Frames.Buttons;

import Frames.Buttons.Button_for_sec.Buttom_add_task;
import Frames.Buttons.Button_for_sec.Buttom_add_task1;
import Frames.Buttons.Button_for_sec.Button_for_Remove;
import Frames.Buttons.Button_for_sec.Button_for_Remove2;
import Frames.Buttons.First_Frame_BUT.Reg_But;
import Frames.Buttons.First_Frame_BUT.Sign_in_BUT;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class But_to_Jpanal {



    private final Get_Build getBuild;
    private final Reg_But regBut;
    private final Getting_JPanal gettingJPanal;
    private final Sign_in_BUT signInBut;
    private final Buttom_add_task buttomAddTask;
    private final Buttom_add_task1 buttomAddTask1;
    private final Button_for_Remove buttonForRemove;
    private final Button_for_Remove2 buttonForRemove2;


    public But_to_Jpanal(Get_Build getBuild, Reg_But regBut, Getting_JPanal gettingJPanal,
                         Sign_in_BUT signInBut, Buttom_add_task buttomAddTask,
                         Buttom_add_task1 buttomAddTask1, Button_for_Remove buttonForRemove,
                         Button_for_Remove2 buttonForRemove2)
    {
        this.getBuild = getBuild;
        this.regBut = regBut;
        this.gettingJPanal = gettingJPanal;
        this.signInBut = signInBut;
        this.buttomAddTask = buttomAddTask;
        this.buttomAddTask1 = buttomAddTask1;
        this.buttonForRemove = buttonForRemove;
        this.buttonForRemove2 = buttonForRemove2;
    }

    public JPanel setButton(BUTTONS buttons) {

        JButton jButton = null;
        switch (buttons) {
            case REG_BUTA:

                 jButton = getBuild.addButton(regBut);
                break;
            case SIGN_IN_BUT:
                jButton = getBuild.addButton(signInBut);
                break;
            case BUTTON_ADD_TASK:
                jButton = getBuild.addButton(buttomAddTask);
                break;
            case BUTTON_ADD_TASK1:
                jButton = getBuild.addButton(buttomAddTask1);
                break;
            case REMOVING_BUTTON:
                jButton = getBuild.addButton(buttonForRemove);
                break;
            case REMOVING_BUTTON2:
                jButton = getBuild.addButton(buttonForRemove2);
                break;
            }



            return gettingJPanal.setjPanel_but(jButton);
    }

}
