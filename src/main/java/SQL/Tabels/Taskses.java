package SQL.Tabels;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "tasks")
public class Taskses implements ZZ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user; // Изменяем тип на Users

    @Column(name = "task_title")
    private String taskTitle;

    @Column(name = "task_description")
    private String taskDescription;

    @Column(name = "date_of_create",columnDefinition = "DATE")
    private Date date;

    @Column(name = "deadline_date",columnDefinition = "DATE")
    private Date deadline;

    public Taskses() {
    }

    public Taskses(Users user, String taskTitle, String taskDescription, Date date, Date deadline) {
        this.user = user; // Устанавливаем пользователя
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.date = date;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "taskTitle=' " + taskTitle + '\'' +
                ", taskDescription=' " + taskDescription + '\'' +
                ", date= " + date +
                ", deadline= " + deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user; // Возвращаем объект пользователя
    }

    public void setUser(Users user) {
        this.user = user; // Устанавливаем объект пользователя
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}