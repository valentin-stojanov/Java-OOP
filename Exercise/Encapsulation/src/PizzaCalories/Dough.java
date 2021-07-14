package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType){
        this.flourType = Validator.validateDoughModifiers(flourType);
    }

    private void setBakingTechnique(String bakingTechnique){
        this.bakingTechnique = Validator.validateDoughModifiers(bakingTechnique);
    }

    private void setWeight(double weight){
        this.weight = Validator.validateDoughWeight(weight);
    }

    public double calculateCalories(){
        double doughModifierValue = DoughModifiers.valueOf(this.flourType.toUpperCase())
                .getModifierValue();

        double bakingTechniqueModifierValue = DoughModifiers.valueOf(this.bakingTechnique.toUpperCase())
                .getModifierValue();

        return (this.weight * 2) * doughModifierValue * bakingTechniqueModifierValue;
    }

}
