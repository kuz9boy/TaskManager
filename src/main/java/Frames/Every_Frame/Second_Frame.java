package Frames.Every_Frame;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.AA;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Second_Frame {
    private final Main_Frame mainFrame;
    private final AA aa;
    private final Getting_JPanal gettingJPanal;

    public Second_Frame(@Qualifier("main_Frame") Main_Frame mainFrame, AA aa, Getting_JPanal gettingJPanal) {
        this.mainFrame = mainFrame;
        this.aa = aa;
        this.gettingJPanal = gettingJPanal;
    }
    public void initialize(){
        gettingJPanal.getjPanel().removeAll();
        mainFrame.getFrame().repaint();

        mainFrame.add_to_Frame(aa.getBut(BUTTONS.BUTTON_ADD_TASK));
        mainFrame.add_to_Frame(aa.getBut(BUTTONS.REMOVING_BUTTON2));
        mainFrame.add_to_Frame(aa.getLabel());
        mainFrame.getFrame().revalidate();

    }

}
