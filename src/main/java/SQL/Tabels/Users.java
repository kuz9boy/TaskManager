package SQL.Tabels;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements ZZ {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public  Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Taskses> tasksesList = new ArrayList<>();

    public void addTaskForUsers(Taskses task) {
        tasksesList.add(task);
        task.setUser(this);
    }




    public Users() {
    }

    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Taskses> getTasksesList() {
        return tasksesList;
    }

    public void setTasksesList(ArrayList<Taskses> tasksesList) {
        this.tasksesList = tasksesList;
    }


}
