package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private int numberOfToppings;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.toppings = new ArrayList<>();
        this.setNumberOfToppings(numberOfToppings);
    }

    private void setName(String name) {
        this.name = Validator.validatePizzaName(name);
    }

    private void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = Validator.validateNumberOfToppings(numberOfToppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping (Topping topping){
        this.toppings.add(topping);
        Validator.validateNumberOfToppings(toppings.size());
    }

    public double getOverallCalories(){
        double doughCalories = this.dough.calculateCalories();
        double toppingsCalories = this.toppings.stream()
                .mapToDouble(Topping::calculateCalories)
                .sum();
        return doughCalories + toppingsCalories;
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f", this.getName(), this.getOverallCalories());
    }

}
