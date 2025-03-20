package SQL.Zaprosi.For_Tasks;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Remove_from_Task {
    public static void removTask(String name){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager manager = factory.createEntityManager();

        try {
            // Opening a transaction
            manager.getTransaction().begin();

            // Executing the delete query with a named parameter
            manager.createQuery("DELETE FROM Taskses WHERE taskTitle = :taskname")
                    .setParameter("taskname", name)
                    .executeUpdate();

            // Committing the transaction
            manager.getTransaction().commit();

        } catch (Exception e) {
            // Rollback in case of an error
            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            System.err.println("Error occurred while deleting the task: " + e.getMessage());
        } finally {
            // Cleanup: Close EntityManager and EntityManagerFactory
            if (manager != null) {
                manager.close();
            }
            factory.close();
        }
    }
}
