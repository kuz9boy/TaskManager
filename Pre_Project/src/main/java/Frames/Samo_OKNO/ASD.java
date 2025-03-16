package Frames.Samo_OKNO;

import Frames.Every_Frame.First_Frame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ASD {
    private final Main_Frame mainFrame;
    private final First_Frame frame;
    @Autowired
    public ASD(@Qualifier("main_Frame") Main_Frame mainFrame, First_Frame frame) {
        this.mainFrame = mainFrame;
        this.frame = frame;
    }

    public void open() {
        frame.initialize();



    }
}
