package SQL.Zaprosi.For_Users;

import SQL.Tabels.ZZ;

import java.lang.reflect.Constructor;

public class GET_CLAS_CONST {
    public static <T extends ZZ> T setZZes(Class<T> zzClass, String... args) {
        try {
            Constructor<?>[] constructors = zzClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                if(constructor.getParameterCount()==args.length){
                    return zzClass.cast(constructor.newInstance((Object[]) args));
                }}
            throw new IllegalArgumentException("нет подходящего конструктора класса" + zzClass.getName());
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("faild" + zzClass.getName(),e);
        }

    }
}