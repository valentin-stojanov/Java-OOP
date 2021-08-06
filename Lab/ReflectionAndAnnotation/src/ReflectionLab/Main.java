package ReflectionLab;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Reflection> clazz = Reflection.class;

        System.out.println("class " + clazz.getSimpleName());
        System.out.println("class java.lang." + clazz.getSuperclass().getSimpleName());

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println("interface java.io." + anInterface.getSimpleName());
        }

        Constructor<Reflection> ctor = clazz.getDeclaredConstructor();

        Reflection reflection = ctor.newInstance();

        System.out.println(reflection.toString());


    }
}
