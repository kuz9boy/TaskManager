package Frames.Constr_For_Frame;

import Frames.Samo_OKNO.Main_Frame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClearFrame {
    private final Main_Frame mainFrame;



    public ClearFrame(@Qualifier("main_Frame") Main_Frame mainFrame) {
        this.mainFrame = mainFrame;
    }
    public void clear(){
        mainFrame.getFrame().removeAll();
    }
}
