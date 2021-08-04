package WildFarm.animals;

import WildFarm.foods.Food;
import WildFarm.foods.Vegetable;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food){
        if (food instanceof Vegetable){
            super.eat(food);
        }else {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }


}
