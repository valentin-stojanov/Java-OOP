package WildFarm;

import WildFarm.animals.*;
import WildFarm.foods.Food;
import WildFarm.foods.Meat;
import WildFarm.foods.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodInfo = scanner.nextLine();

        while (!foodInfo.equals("End")) {
            Food food = createFood(foodInfo);

            String animalInfo = scanner.nextLine();
            Animal animal = createAnimal(animalInfo);

            animal.eat(food);


            foodInfo = scanner.nextLine();
        }
    }

    private static Food createFood(String foodInfo) {
        String[] tokens = foodInfo.split("\\s+");
        String foodType = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);

        return foodType.equals("Meat")
                ? new Meat(quantity)
                : new Vegetable(quantity);
    }

    private static Animal createAnimal(String animalInfo) {
        String[] tokens = animalInfo.split("\\s+");
        String animalType = tokens[0];
        String animalName = tokens[1];
        double animalWeight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];
        Animal animal;

        switch (animalType) {
            case "Cat":
                String breed = tokens[4];
                animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                break;
            case "Tiger":
                animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            default:
                throw new IllegalArgumentException("Invalid animal type");
        }
        return animal;
    }
}
