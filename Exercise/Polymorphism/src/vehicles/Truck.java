package vehicles;

public class Truck extends Vehicle {
    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption();
    }

    @Override
    void setFuelConsumption() {
        super.fuelConsumption += 1.6;
    }

    @Override
    void refuel(double liters) {
        super.fuelQuantity += liters * 0.95;
    }
}
