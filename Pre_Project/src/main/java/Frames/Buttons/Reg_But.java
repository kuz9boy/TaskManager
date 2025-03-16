package Frames.Buttons;

import Frames.Stroki.Name_Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Reg_But implements Button {
    private final JButton regisBut;
    private Name_Line nameLine;
    public Reg_But(Name_Line nameLine) {
        this.regisBut = new JButton("Register");
        this.regisBut.setSize(100, 50);
        this.nameLine = nameLine;
    }

    @Override
    public void buttomFunction() {

        String a = nameLine.getjTextField();
//        String c = Password.getStrokaPas().getText();
//
//        if(ASK_FROM_TABLE.searchInTable(Users.class,"name",a,"password",c)!=null){
//            System.out.println("polzovatel uzhe существует");
//        }
//        else {
//
//            Users user = ADD_IN_TABLE.add_in(Users.class, a, c);
//            Current_User.setCurrentUser(user);
//            System.out.println("вы вошли");
//
//            Second_Frame.az();
//
//        }
        System.out.println(a);
    }

}
