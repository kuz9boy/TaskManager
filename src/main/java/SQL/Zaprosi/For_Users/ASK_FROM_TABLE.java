package SQL.Zaprosi.For_Users;

import SQL.Tabels.ZZ;
import jakarta.persistence.*;

import java.util.List;

public class ASK_FROM_TABLE {

    // При желании EntityManagerFactory можно вынести в статическое поле
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("jpa-course");

    public static ZZ searchInTable(Class<? extends ZZ> zzClass, String... values) {
        // Проверка на валидность количества параметров
        if (values.length % 2 != 0) {
            throw new IllegalArgumentException("Values must contain an even number of elements (field-value pairs).");
        }

        EntityManager manager = FACTORY.createEntityManager();
        ZZ zz = null;

        try {
            // Формируем запрос JPQL
            StringBuilder jpql = new StringBuilder("SELECT e FROM ");
            jpql.append(zzClass.getSimpleName()).append(" e");

            if (values.length > 0) {
                jpql.append(" WHERE ");
                for (int i = 0; i < values.length; i += 2) {
                    if (i > 0) {
                        jpql.append(" AND ");
                    }
                    jpql.append("e.").append(values[i]).append(" = :param").append(i / 2);
                }
            }

            // Создаем запрос
            TypedQuery<? extends ZZ> query = manager.createQuery(jpql.toString(), zzClass);

            // Устанавливаем параметры
            for (int i = 0; i < values.length; i += 2) {
                query.setParameter("param" + (i / 2), values[i + 1]);
            }

            // Получаем результат (попробуем получить первую запись, если список не пуст)
            List<? extends ZZ> results = query.getResultList();
            if (!results.isEmpty()) {
                zz = results.get(0); // Берем только первый элемент
            }
        } catch (NoResultException e) {
            System.out.println("No results found for the given query.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (manager != null) manager.close();
        }

        return zz; // Вернем найденный объект или null
    }
}
