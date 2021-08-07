package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Field[] fields = RichSoilLand.class.getDeclaredFields();

        StringBuilder builder = new StringBuilder();
        while (!command.equals("HARVEST")) {
            String modifier = command;
            Arrays.stream(fields)
                    .filter(f -> Modifier.toString(f.getModifiers()).equals(modifier) || modifier.equals("all") )
                    .forEach(field -> {
                        builder.append(String.format("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName() ,field.getName()));
                    });

            command = scanner.nextLine();
        }
        System.out.println(builder.toString());
    }
}
