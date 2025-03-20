package SQL.Zaprosi.For_Users;

import SQL.Tabels.Users;
import SQL.Tabels.ZZ;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ADD_IN_TABLE {
    public static <T extends ZZ> Users add_in(Class<T> zzClass, String... values) {
        ZZ zz = GET_CLAS_CONST.setZZes(zzClass, values);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();

            manager.persist(zz);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (manager != null) {
                manager.close();
                factory.close();
            }
        }

        return (Users) zz;
    }
}
