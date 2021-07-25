package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Identifiable> citizenAndRobots = new ArrayList<>();

        while (!command.equals("End")){

            String[] tokens = command.split("\\s+");
            boolean isRobot = isRobot(tokens.length);

            if (isRobot){
                String id = tokens[0];
                String model = tokens[1];
                Robot robot = new Robot(id, model);
                citizenAndRobots.add(robot);
            } else {
                String name = tokens[0];
                int age =  Integer.parseInt(tokens[1]);
                String id = tokens[2];
                Citizen citizen = new Citizen(name, age, id);
                citizenAndRobots.add(citizen);
            }

            command = scanner.nextLine();
        }

        int fakeIdNumber = Integer.parseInt(scanner.nextLine());

        for (Identifiable citizenAndRobot : citizenAndRobots) {
            if (fakeIdNumber == citizenAndRobot.identify()){
                System.out.println(citizenAndRobot.getId());
            }
        }
    }

    private static boolean isRobot(int length) {
        return length < 3;
    }
}
