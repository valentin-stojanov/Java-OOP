package GettersAndSetters;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();
        Method[] getters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("get") &&
                        m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Method[] setters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Arrays.stream(getters)
                .forEach(method ->
                        System.out.printf("%s will return class %s%n",
                                method.getName(), method.getReturnType().getName()));

        Arrays.stream(setters)
                .forEach(m ->
                        System.out.printf("%s and will set field of class %s%n",
                                m.getName(), m.getParameterTypes()[0].getName()));

    }
}
