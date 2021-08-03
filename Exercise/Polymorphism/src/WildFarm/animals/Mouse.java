package WildFarm.animals;

import WildFarm.foods.Food;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}
