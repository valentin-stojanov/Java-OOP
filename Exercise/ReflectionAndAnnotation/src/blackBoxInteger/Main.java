package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Constructor<BlackBoxInt> constructor = null;
        try {
            constructor = BlackBoxInt.class.getDeclaredConstructor(int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance(0);

        while (!input.equals("END")) {

            String[] tokens = input.split("_");
            String methodName = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            try {
                Method method = blackBoxInt.getClass().getDeclaredMethod(methodName, int.class);
                method.setAccessible(true);
                method.invoke(blackBoxInt, value);
                Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);
                System.out.println(field.get(blackBoxInt));
            } catch (NoSuchMethodException | NoSuchFieldException e) {
                e.printStackTrace();
            }


            input = scanner.nextLine();
        }

    }
}
