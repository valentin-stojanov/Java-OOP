package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String pizzaName = input[1];
        int numberOfToppings = Integer.parseInt(input[2]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        String[] doughData = scanner.nextLine().split("\\s+");
        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double weightInGrams = Double.parseDouble(doughData[3]);

        Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);

        pizza.setDough(dough);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            String[] toppingData = command.split("\\s+");
            String toppingType= toppingData[1];
            double toppingGrams = Double.parseDouble(toppingData[2]);

            Topping topping = new Topping(toppingType, toppingGrams);
            pizza.addTopping(topping);

            command = scanner.nextLine();
        }

        System.out.println(pizza.toString());
    }
}
