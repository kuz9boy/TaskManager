package Frames.Buttons.First_Frame_BUT;

import Frames.Buttons.Button;
import Frames.Constr_For_Frame.ClearFrame;
import Frames.Every_Frame.Second_Frame;
import Frames.Stroki.For_First_Frame.Name_Line;
import Frames.Stroki.For_First_Frame.Password_Line;
import SQL.Current_User;
import SQL.Tabels.Users;
import SQL.Zaprosi.For_Users.ADD_IN_TABLE;
import SQL.Zaprosi.For_Users.ASK_FROM_TABLE;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Reg_But implements Button {
    private final JButton button = new JButton("Registrate");
    private final Name_Line nameLine;
    private final Password_Line passwordLine;
    private final ClearFrame clearFrame;
    private final Second_Frame secondFrame;
    public Reg_But(Name_Line nameLine, Password_Line passwordLine, ClearFrame clearFrame, Second_Frame secondFrame) {
        this.passwordLine = passwordLine;
        this.clearFrame = clearFrame;
        this.secondFrame = secondFrame;


        this.button.setSize(100, 50);
        this.nameLine = nameLine;
    }

    @Override
    public void buttomFunction() {

        String a = nameLine.getText();
        String c = passwordLine.getText();

        if(ASK_FROM_TABLE.searchInTable(Users.class,"name",a,"password",c)!=null){
            System.out.println("polzovatel uzhe существует");
        }
        else {

            Users user = ADD_IN_TABLE.add_in(Users.class, a, c);
            Current_User.setCurrentUser(user);
            System.out.println("вы вошли");
//            clearFrame.clear();
            secondFrame.initialize();


        }

    }
    public JButton getBut(){
        return button;
    }

}
