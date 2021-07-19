package NeedForSpeed;

public class Car extends Vehicle {
    public static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsepower){
        super(fuel, horsepower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
