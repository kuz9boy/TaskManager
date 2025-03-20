package SQL.Zaprosi.For_Tasks;

import SQL.Current_User;
import SQL.Tabels.Taskses;
import SQL.Tabels.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Get_LIST_OF_TASKS {

    public static List<Taskses> get(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager manager = factory.createEntityManager();
        List<Taskses> taskses = new ArrayList<>();

        try {
            Users currentUser = Current_User.getCurrentUser();

            taskses = manager.createQuery(
                            "SELECT t FROM Taskses t JOIN FETCH t.user u WHERE u.id = :userId", Taskses.class)
                    .setParameter("userId", currentUser.getId())
                    .getResultList();

        } catch (Exception e) {
            System.err.println("Error occurred while retrieving tasks: " + e.getMessage());
        } finally {
            if (manager != null) {
                manager.close();
            }
            factory.close();
        }
        return taskses;
    }
}


