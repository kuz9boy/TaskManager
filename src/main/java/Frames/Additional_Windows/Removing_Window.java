package Frames.Additional_Windows;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.AA;
import Frames.Constr_For_Frame.Get_Build;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import Frames.Stroki.STROKS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Removing_Window {
    private final Main_Frame mainFrame;
    private final Get_Build getBuild;
    private final AA aa;
    private final Getting_JPanal gettingJPanal;
    private JDialog dialog;

    @Autowired
    public Removing_Window(@Qualifier("main_Frame") Main_Frame mainFrame, Get_Build getBuild, AA aa, Getting_JPanal gettingJPanal) {
        this.mainFrame = mainFrame;
        this.getBuild = getBuild;
        this.aa = aa;
        this.dialog = new JDialog(mainFrame.getFrame(), "Окно для удаления задачи", true);
        this.gettingJPanal = gettingJPanal;
    }

    public void showDial() {
        dialog.setSize(300, 150);
        gettingJPanal.getjPanel().removeAll();
        dialog.add(aa.getBut(BUTTONS.REMOVING_BUTTON));
        dialog.add(aa.getStroka(STROKS.STROKA_NAME));
    }
}