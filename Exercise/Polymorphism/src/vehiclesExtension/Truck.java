package vehiclesExtension;

public class Truck extends Vehicle {
    private static final double FUEL_CONSUMPTION_AC = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double capacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_AC, capacity);
    }

    @Override
    public void refuel(double liters){
        super.refuel(liters * 0.95);
    }

}

