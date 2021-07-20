package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!line.equals("Beast!")) {

            String type = line;
            String[] tokens = scanner.nextLine().split("\\s+");

            try {
                Animal animal = createAnimal(type, tokens);
                animals.add(animal);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

            line = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.produceSound());
        }
    }

    private static Animal createAnimal(String type, String[] tokens) {
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        Gender gender = Gender.valueOf(tokens[2].toUpperCase());
        Animal animal;
        switch (type) {
            case "Cat":
                animal = new Cat(name, age, gender);
                break;
            case "Dog":
                animal = new Dog(name, age, gender);
                break;
            case "Frog":
                animal = new Frog(name, age, gender);
                break;
            case "Kitten":
                animal = new Kitten(name, age);
                break;
            case "Tomcat":
                animal = new Tomcat(name, age);
                break;
            default:
                throw new IllegalStateException("Invalid animal type!");
        }
        return animal;
    }
}
