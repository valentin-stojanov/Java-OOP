package WildFarm.animals;

import WildFarm.foods.Food;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {
        super.getFoodEaten() += food.getQuantity();
    }
}
