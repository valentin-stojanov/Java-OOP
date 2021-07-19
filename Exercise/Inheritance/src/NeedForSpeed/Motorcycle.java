package NeedForSpeed;

public class Motorcycle extends Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public Motorcycle(double fuel, int horsepower) {
        super(fuel, horsepower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}


