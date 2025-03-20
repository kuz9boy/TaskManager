package Frames.Buttons.Button_for_sec;

import Frames.Buttons.Button;
import Frames.Labels.Show_Tasks;
import Frames.Stroki.For_First_Frame.Name_Line;
import Frames.Stroki.For_First_Frame.Password_Line;
import Frames.Stroki.For_Second_Frame.Stroka_for_ADD_task_Discrip;
import Frames.Stroki.For_Second_Frame.Stroka_for_ADD_task_Name;
import Frames.Stroki.For_Second_Frame.Stroka_for_DATA;
import Frames.Stroki.For_Second_Frame.Stroka_for_deadline;
import SQL.Zaprosi.For_Tasks.Add_Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
@Component
public class Buttom_add_task1 implements Button {


    private final JButton regisBut = new JButton("Добавить");
    private final Stroka_for_ADD_task_Name strokaForAddTaskName;
    private final Stroka_for_ADD_task_Discrip strokaForAddTaskDiscrip;
    private final Stroka_for_DATA strokaForData;
    private final Stroka_for_deadline strokaForDeadline;
    private final Show_Tasks showTasks;


    public Buttom_add_task1(Stroka_for_ADD_task_Name strokaForAddTaskName, Stroka_for_ADD_task_Discrip strokaForAddTaskDiscrip,
                            Stroka_for_DATA strokaForData, Stroka_for_deadline strokaForDeadline, Show_Tasks showTasks)

    {
        this.strokaForAddTaskName = strokaForAddTaskName;
        this.strokaForAddTaskDiscrip = strokaForAddTaskDiscrip;
        this.strokaForData = strokaForData;
        this.strokaForDeadline = strokaForDeadline;
        this.showTasks = showTasks;


        this.regisBut.setSize(100, 50);

    }


    @Override
    public void buttomFunction() {

        String a = strokaForAddTaskName.getText();
        String b = strokaForAddTaskDiscrip.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        java.sql.Date c = null;
        java.sql.Date d = null;

        try {
            c = new java.sql.Date(formatter.parse(strokaForData.getText()).getTime());
            d = new java.sql.Date(formatter.parse(strokaForDeadline.getText()).getTime());
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date: " + e.getMessage(), e);
        }

        Add_Task.add_in(a, b, c, d);
        showTasks.refreshTasks();

    }

    @Override
    public JButton getBut() {
        return null;
    }


}
