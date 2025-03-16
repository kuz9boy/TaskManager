package Frames.Every_Frame;

import Frames.Buttons.BUTTONS;
import Frames.Buttons.Reg_But;
import Frames.Constr_For_Frame.AA;
import Frames.Samo_OKNO.Main_Frame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class First_Frame {
    private final Main_Frame mainFrame;
    private final AA aa;
    private final Reg_But reg_But;

    @Autowired
    public First_Frame(@Qualifier("main_Frame") Main_Frame mainFrame, AA aa, Reg_But reg_But) {
        this.mainFrame = mainFrame;
        this.aa = aa;
        this.reg_But = reg_But;
    }

    public void initialize() {
        mainFrame.createWindo().add(aa.getBut(BUTTONS.REG_BUTA));
    }
}
