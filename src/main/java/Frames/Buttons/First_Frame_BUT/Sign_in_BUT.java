package Frames.Buttons.First_Frame_BUT;

import Frames.Buttons.Button;
import Frames.Constr_For_Frame.ClearFrame;
import Frames.Every_Frame.Second_Frame;
import Frames.Stroki.For_First_Frame.Name_Line;
import Frames.Stroki.For_First_Frame.Password_Line;
import SQL.Current_User;
import SQL.Tabels.Users;
import SQL.Zaprosi.For_Users.ASK_FROM_TABLE;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Sign_in_BUT implements Button {
    int length;
    int high;
    JButton button = new JButton("Sign_IN");
    private final Password_Line passwordLine;
    private final Name_Line nameLine;
    private final Second_Frame secondFrame;

    public Sign_in_BUT(Name_Line nameLine, Password_Line passwordLine, Second_Frame secondFrame) {
        this.passwordLine = passwordLine;
        this.secondFrame = secondFrame;


        this.button.setSize(100, 50);
        this.nameLine = nameLine;
    }





    @Override
    public void buttomFunction() {

        String a = nameLine.getText();
        String c = passwordLine.getText();

        Users user = (Users) ASK_FROM_TABLE.searchInTable(Users.class, "name", a, "password", c);{
            if (user == null) {
                System.out.println("Данного пользователя не существует");
            } else {
                System.out.println("Вы вошли");
                Current_User.setCurrentUser(user);
                secondFrame.initialize();

            }
        }
    }

    @Override
    public JButton getBut() {
        return button;
    }


}

