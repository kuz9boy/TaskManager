package SQL.Zaprosi.For_Tasks;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Remove_from_Task {
    public static void removTask(String name){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager manager = factory.createEntityManager();

        try {

            manager.getTransaction().begin();


            manager.createQuery("DELETE FROM Taskses WHERE taskTitle = :taskname")
                    .setParameter("taskname", name)
                    .executeUpdate();

            manager.getTransaction().commit();

        } catch (Exception e) {

            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            System.err.println("Error occurred while deleting the task: " + e.getMessage());
        } finally {

            if (manager != null) {
                manager.close();
            }
            factory.close();
        }
    }
}
