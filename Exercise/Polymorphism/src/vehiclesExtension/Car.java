package vehiclesExtension;

public class Car extends Vehicle {
    private static final double FUEL_CONSUMPTION_AC = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double capacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_AC, capacity);
    }



}
