package SQL.Zaprosi.For_Tasks;

import SQL.Current_User;
import SQL.Tabels.Taskses;
import SQL.Tabels.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Date;
import java.time.LocalDate;

public class Add_Task {
    public static void add_in(String a, String b, java.sql.Date c, Date d) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        Users currentUser = Current_User.getCurrentUser();

        try {
            transaction.begin();

            Users users = manager.find(Users.class, currentUser.getId());
            if (users == null) {
                System.out.println("User not found!");
                return;
            }

            LocalDate createDate = LocalDate.of(1866, 10, 3);
            LocalDate deadlineDate = LocalDate.of(1866, 10, 3);
            Taskses taskses = new Taskses(users, a, b, c, d);

            users.addTaskForUsers(taskses);
            manager.persist(users);
            transaction.commit();

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Error occurred while adding task: " + e.getMessage());
        } finally {
            if (manager != null) {
                manager.close();
            }
            factory.close();
        }
    }
}