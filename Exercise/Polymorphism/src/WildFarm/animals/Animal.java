package WildFarm.animals;

import WildFarm.foods.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;

    private int foodEaten;

    protected Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public abstract void makeSound();

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }
}
