package Frames.Every_Frame;

import Frames.Buttons.BUTTONS;
import Frames.Constr_For_Frame.AA;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Samo_OKNO.Main_Frame;
import Frames.Stroki.STROKS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class First_Frame {
    private final Main_Frame mainFrame;
    private final AA aa;
    private final Getting_JPanal gettingJPanal;

    @Autowired
    public First_Frame(@Qualifier("main_Frame") Main_Frame mainFrame, AA aa, Getting_JPanal gettingJPanal) {
        this.mainFrame = mainFrame;
        this.aa = aa;
        this.gettingJPanal = gettingJPanal;
    }

    public void initialize() {

        mainFrame.add_to_Frame(aa.getBut(BUTTONS.REG_BUTA));
        mainFrame.add_to_Frame(aa.getBut(BUTTONS.SIGN_IN_BUT));
        mainFrame.add_to_Frame(aa.getStroka(STROKS.STROKA_NAME));
        mainFrame.add_to_Frame(aa.getStroka(STROKS.STROKA_PASSWORD));
        mainFrame.createWindo();



    }
}
