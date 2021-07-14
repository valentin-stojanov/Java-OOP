package PizzaCalories;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private Validator() {

    }

    public static String validateDoughModifiers(String doughModifier) {
        String modifierName = doughModifier.toUpperCase();
        if (!DoughModifiers.containsValue(modifierName)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        return doughModifier;
    }

    public static double validateDoughWeight(double weight) {
        if (!(1 <= weight && weight <= 200)) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        return weight;
    }

    public static String validateToppingModifiers(String toppingModifier) {
        String modifierName = toppingModifier.toUpperCase();
        if (!ToppingsModifiers.containsValue(modifierName)) {
            throw new IllegalArgumentException("Cannot place " + toppingModifier + " on top of your pizza.");
        }
        return toppingModifier;
    }

    public static double validateToppingWeight(double weight, String name) {
        if (!(1 <= weight && weight <= 50)) {
            throw new IllegalArgumentException(name + " weight should be in the range [1..50].");
        }
        return weight;
    }

    public static String validatePizzaName(String name) {
//        Pattern pattern = Pattern.compile("^\\w[\\s\\S]{1,13}\\w$");
//        Matcher matcher = pattern.matcher(name);
        if (name.trim().isEmpty() || !(1 <= name.length() && name.length() <= 15)) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        return name;
    }

    public static int validateNumberOfToppings(int numberOfToppings) {
        if (!(0 <= numberOfToppings && numberOfToppings <= 10)){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        return numberOfToppings;
    }
}
