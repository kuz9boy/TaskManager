package Frames.Additional_Windows;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.AA;
import Frames.Every_Frame.Second_Frame;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import Frames.Stroki.STROKS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
@Component
public class Additional_Window {
   private final AA aa;
   private final Main_ADD_WIND mainAddWind;

   private final Getting_JPanal gettingJPanal;
   private final Second_Frame secondFrame;

   public Additional_Window(AA aa, Main_ADD_WIND mainAddWind, Getting_JPanal gettingJPanal, Second_Frame secondFrame) {
        this.aa = aa;
       this.mainAddWind = mainAddWind;
        this.gettingJPanal = gettingJPanal;
       this.secondFrame = secondFrame;
   }

    public  void showDial(){
        mainAddWind.getjDialog().setSize(300,150);

        gettingJPanal.getjPanel().removeAll();
        mainAddWind.getjDialog().add(aa.getBut(BUTTONS.BUTTON_ADD_TASK1));
        mainAddWind.getjDialog().add(aa.getStroka(STROKS.STROKA_FOR_ADD_TASK_NAME));
        mainAddWind.getjDialog().add(aa.getStroka(STROKS.STROKA_FOR_ADD_TASK_DISC));
        mainAddWind.getjDialog().add(aa.getStroka(STROKS.STROKA_FOR_ADD_TASK_DATA));
        mainAddWind.getjDialog().add(aa.getStroka(STROKS.STROKA_FOR_ADD_TASK_DEADLINE));

        mainAddWind.getjDialog().setLayout(new FlowLayout());


        mainAddWind.getjDialog().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                secondFrame.initialize();
            }
        });

        mainAddWind.getjDialog().setVisible(true);
    }
}
