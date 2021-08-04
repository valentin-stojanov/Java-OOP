package WildFarm;

import WildFarm.animals.*;
import WildFarm.foods.Food;
import WildFarm.foods.Meat;
import WildFarm.foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String animalInfo = scanner.nextLine();

        while (!animalInfo.equals("End")) {

            String foodInfo = scanner.nextLine();

            Food food = createFood(foodInfo);
            Animal animal = createAnimal(animalInfo);
            animals.add(animal);
            animal.makeSound();

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
         animalInfo = scanner.nextLine();

        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
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
