package WildFarm.animals;

import WildFarm.foods.Food;

public abstract class Animal {
    private String animalName;
    private  String animalType;
    private double animalWeight;

    protected int getFoodEaten() {
        return foodEaten;
    }

    private int foodEaten;

    protected Animal(String animalName, String animalType, double animalWeight){
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}
