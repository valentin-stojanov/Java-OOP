package PizzaCalories;

import java.util.Arrays;

public enum DoughModifiers {
    WHITE (1.5),
    WHOLEGRAIN (1.0),
    CRISPY (0.9),
    CHEWY (1.1),
    HOMEMADE (1.0);

    private final double modifierValue;

    DoughModifiers(double modifier){
        this.modifierValue = modifier;

    }

    public double getModifierValue(){
        return this.modifierValue;
    }

    public static boolean containsValue(String doughModifier){
        String name = doughModifier.toUpperCase();
        return Arrays.stream(DoughModifiers.values()).anyMatch(v -> name.equals(v.name()));
    }

}
