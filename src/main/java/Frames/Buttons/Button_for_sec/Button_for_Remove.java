package Frames.Buttons.Button_for_sec;


import Frames.Buttons.Button;
import Frames.Labels.Show_Tasks;
import Frames.Stroki.For_Second_Frame.Removing_stroka;
import SQL.Zaprosi.For_Tasks.Remove_from_Task;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class Button_for_Remove implements Button {


    JButton button = new JButton("Удалить задачу");
    private final Removing_stroka removingStroka;
    private final Show_Tasks showTasks;

    public Button_for_Remove(Removing_stroka removingStroka, Show_Tasks showTasks) {
        this.removingStroka = removingStroka;
        this.showTasks = showTasks;

        button.setSize(200,150);
    }


    @Override
    public void buttomFunction() {
        String s = removingStroka.getText().trim();
        Remove_from_Task.removTask(s);
        System.out.println("GFDIKGHJROIE"+s);

    }

    @Override
    public JButton getBut() {
        return button;
    }


}
