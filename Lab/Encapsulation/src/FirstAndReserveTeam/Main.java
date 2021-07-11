package FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Team team = new Team("Black Eagles");
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
//                people.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
                team.addPlayer(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }
            catch (IllegalArgumentException message){
                System.out.println(message);
            }
        }
//        double bonus = Double.parseDouble(reader.readLine());
//        for (Person person : people) {
//            person.increaseSalary(bonus);
//            System.out.println(person.toString());
//        }
        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }

}
