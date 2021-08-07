package HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Reflection> clazz = Reflection.class;

        Field[] fields = clazz.getDeclaredFields();

        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f ->
                        System.out.printf("%s must be private!%n", f.getName()));

        Arrays.stream(clazz.getDeclaredMethods())
                .filter(g -> g.getName().startsWith("get"))
                .filter(g -> !Modifier.isPublic(g.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(g ->
                        System.out.printf("%s have to be public!%n", g.getName()));

        Arrays.stream(clazz.getDeclaredMethods())
                .filter(s -> s.getName().startsWith("set"))
                .filter(s -> !Modifier.isPrivate(s.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(s ->
                        System.out.printf("%s have to be private!%n", s.getName()));

    }
}
