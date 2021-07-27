package birthdayCelebrations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] tokens = command.split("\\s+");
            String type = tokens[0];
            switch (type){
                case "Citizen":
                    Birthable citizen = new Citizen(tokens[1],Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(tokens[1], tokens[2]);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(tokens[1], tokens[2] );
                    robots.add(robot);
                    break;
            }

            command = scanner.nextLine();
        }

        String year = scanner.nextLine();
        boolean hasOutput = false;

        for (Birthable birthable : birthableList) {
            String birthdate = birthable.getBirthDate();
            if (birthdate.contains(year)){
                System.out.println(birthdate);
                hasOutput = true;
            }
        }
        if (!hasOutput){
            System.out.println("<no output>");
        }
    }
}
