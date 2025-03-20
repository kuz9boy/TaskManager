package Frames.Labels;

import SQL.Tabels.Taskses;
import SQL.Zaprosi.For_Tasks.Get_LIST_OF_TASKS;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.List;
@Component
public class Show_Tasks implements Label_INT {
    private static JLabel jLabel;




    private  void updateTasks() {
        List<Taskses> tasksesList = Get_LIST_OF_TASKS.get();
        StringBuilder sb = new StringBuilder();
        for (Taskses task : tasksesList) {
            sb.append(task.toString()).append("\n");
        }

        jLabel.setText("<html>" + sb.toString().replaceAll("\n", "<br>") + "</html>");
    }


    public  void refreshTasks() {
        updateTasks();
    }


    @Override
    public JLabel getLabel() {
        return jLabel;
    }
}
