package WildFarm.animals;

import WildFarm.foods.Food;
import WildFarm.foods.Meat;
import WildFarm.foods.Vegetable;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food){
        if (food instanceof Meat){
            super.eat(food);
        }else {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }

}
