package PizzaCalories;

import java.util.Arrays;

public enum ToppingsModifiers {

    MEAT (1.2),
    VEGGIES (0.8),
    CHEESE (1.1),
    SAUCE (0.9);

    private final double modifierValue;

    ToppingsModifiers(double modifier) {
        this.modifierValue = modifier;
    }

    public double getModifierValue() {
        return this.modifierValue;
    }

    public static boolean containsValue(String doughModifier){

        return Arrays.stream(ToppingsModifiers.values()).anyMatch(v -> v.name().equals(doughModifier));
    }
}
