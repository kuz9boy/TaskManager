package Frames.Buttons;

import Frames.Buttons.Button_for_sec.Buttom_add_task;
import Frames.Buttons.Button_for_sec.Buttom_add_task1;
import Frames.Buttons.Button_for_sec.Button_for_Remove;
import Frames.Buttons.Button_for_sec.Button_for_Remove2;
import Frames.Buttons.First_Frame_BUT.Reg_But;
import Frames.Buttons.First_Frame_BUT.Sign_in_BUT;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class But_to_Jpanal {
    private final Get_Build getBuild;
    private Reg_But regBut;
    private Getting_JPanal gettingJPanal;
    private Sign_in_BUT signInBut;
    private Buttom_add_task buttomAddTask;
    private Buttom_add_task1 buttomAddTask1;
    private Button_for_Remove buttonForRemove;
    private Button_for_Remove2 buttonForRemove2;

    @Autowired
    public But_to_Jpanal(Get_Build getBuild) {
        this.getBuild = getBuild;
    }

    @Autowired
    public void setRegBut(Reg_But regBut) {
        this.regBut = regBut;
    }

    @Autowired
    public void setGettingJPanal(Getting_JPanal gettingJPanal) {
        this.gettingJPanal = gettingJPanal;
    }

    @Autowired
    public void setSignInBut(Sign_in_BUT signInBut) {
        this.signInBut = signInBut;
    }

    @Autowired
    public void setButtomAddTask(Buttom_add_task buttomAddTask) {
        this.buttomAddTask = buttomAddTask;
    }

    @Autowired
    public void setButtomAddTask1(Buttom_add_task1 buttomAddTask1) {
        this.buttomAddTask1 = buttomAddTask1;
    }

    @Autowired
    public void setButtonForRemove(Button_for_Remove buttonForRemove) {
        this.buttonForRemove = buttonForRemove;
    }

    @Autowired
    public void setButtonForRemove2(Button_for_Remove2 buttonForRemove2) {
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
