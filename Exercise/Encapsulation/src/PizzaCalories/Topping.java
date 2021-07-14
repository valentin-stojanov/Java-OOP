package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        this.toppingType = Validator.validateToppingModifiers(toppingType);
    }

    private void setWeight(double weight) {
        this.weight = Validator.validateToppingWeight(weight, this.toppingType);
    }

    public double calculateCalories() {
        double toppingModifier = ToppingsModifiers.valueOf(this.toppingType.toUpperCase()).getModifierValue();
        return (this.weight * 2) * toppingModifier;
    }
}
