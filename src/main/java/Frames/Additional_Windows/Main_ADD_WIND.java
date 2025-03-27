package Frames.Additional_Windows;

import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Main_ADD_WIND {
    private final Main_Frame mainFrame;
    private JDialog jDialog;

    @Autowired
    public Main_ADD_WIND(@Qualifier("main_Frame") Main_Frame mainFrame) {
        this.mainFrame = mainFrame;
        this.jDialog = new JDialog(mainFrame.getFrame(), "ll", true);
    }

    public JDialog getjDialog() {
        return jDialog;
    }
}
