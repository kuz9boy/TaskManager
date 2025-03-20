package Frames.Constr_For_Frame;

import Frames.Buttons.BUTTONS;
import Frames.Buttons.But_to_Jpanal;
import Frames.Labels.Labal_to_Jpanal;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Stroki.STROKS;
import Frames.Stroki.Stroka_to_Jpanal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AA {
    private But_to_Jpanal butToJpanal;
    private Labal_to_Jpanal labalToJpanal;
    private Stroka_to_Jpanal strokaToJpanal;
    @Autowired
    public void setButToJpanal(But_to_Jpanal butToJpanal) {
        this.butToJpanal = butToJpanal;
    }
    @Autowired
    public void setLabel(Labal_to_Jpanal labalToJpanal){
        this.labalToJpanal = labalToJpanal;
    }

    @Autowired
    public void setStrokaToJpanal(Stroka_to_Jpanal strokaToJpanal){
        this.labalToJpanal = labalToJpanal;
    }
    public JPanel getLabel() {
        return labalToJpanal.setLabel();
    }

    public JPanel getBut(BUTTONS button) {
        return butToJpanal.setButton(button);
    }

    public JPanel getStroka(STROKS stroks) {
        return strokaToJpanal.getStroka(stroks);
    }
}