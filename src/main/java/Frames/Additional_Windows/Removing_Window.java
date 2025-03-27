package Frames.Additional_Windows;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.AA;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Every_Frame.Second_Frame;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import Frames.Stroki.STROKS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Removing_Window {


    private AA aa;
    private Main_ADD_WIND mainAddWind;
    private Getting_JPanal gettingJPanal;
    private Second_Frame secondFrame;

    @Autowired
    public void setAA(AA aa) {
        this.aa = aa;
    }

    @Autowired
    public void setMainAddWind(Main_ADD_WIND mainAddWind) {
        this.mainAddWind = mainAddWind;
    }

    @Autowired
    public void setGettingJPanal(Getting_JPanal gettingJPanal) {
        this.gettingJPanal = gettingJPanal;
    }

    @Autowired
    public void setSecondFrame(Second_Frame secondFrame) {
        this.secondFrame = secondFrame;
    }

    public void showDial() {
        mainAddWind.getjDialog().setSize(300, 150);
        gettingJPanal.getjPanel().removeAll();
        mainAddWind.getjDialog().add(aa.getBut(BUTTONS.REMOVING_BUTTON));
        mainAddWind.getjDialog().add(aa.getStroka(STROKS.STROKA_NAME));
    }
}