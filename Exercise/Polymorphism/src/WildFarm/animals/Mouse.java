package WildFarm.animals;

import WildFarm.foods.Food;
import WildFarm.foods.Vegetable;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food){
        if (food instanceof Vegetable){
            super.eat(food);
        }else {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }
}

