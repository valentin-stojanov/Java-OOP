package WildFarm.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;

    protected Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    public String toString(){
        DecimalFormat formatter = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]",
                getClass().getSimpleName(),
                super.getAnimalName(),
                formatter.format(super.getAnimalWeight()),
                this.livingRegion,
                super.getFoodEaten());
    }
}
