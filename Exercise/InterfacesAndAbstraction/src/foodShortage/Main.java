package foodShortage;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Buyer> buyers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Buyer buyer;
            if (isRebel(tokens.length)) {
                buyer = new Rebel(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2]);
            } else {
                buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2], tokens[3]);
            }
            buyers.add(buyer);
        }

        String command = scanner.nextLine();


        while (!command.equals("End")) {
            String name = command;
            buyers.forEach(buyer ->
            {
                if (name.equals(buyer.getName())) {
                    buyer.buyFood();
                }
            });

            command = scanner.nextLine();
        }

        System.out.println(getTotalFood(buyers));

    }

    private static int getTotalFood(Set<Buyer> buyers) {
        int totalFood = 0;

        for (Buyer buyer : buyers) {
            totalFood += buyer.getFood();
        }
        return totalFood;
    }

    private static boolean isRebel(int length) {
        return length == 3;
    }
}
