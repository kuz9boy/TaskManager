package Frames.Constr_For_Frame;

import Frames.Buttons.BUTTONS;
import Frames.Buttons.But_to_Jpanal;
import Frames.Buttons.Button;
import Frames.Buttons.Reg_But;
import Frames.Samo_OKNO.Getting_JPanal;
import Frames.Stroki.Name_Line;
import Frames.Stroki.Stroka_to_Jpanal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class AA {
   private final But_to_Jpanal butToJpanal;
   private final Stroka_to_Jpanal strokaToJpanal;
    public AA(But_to_Jpanal butToJpanal, Stroka_to_Jpanal strokaToJpanal) {
        this.butToJpanal = butToJpanal;
        this.strokaToJpanal = strokaToJpanal;
    }

    public JPanel getBut(BUTTONS button){
        return butToJpanal.getButton(button);
    }
    public JPanel getStroka(){
        return strokaToJpanal.getStroka();
    }

}
