package vehicles;

public class Car extends Vehicle {

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption();
    }

    @Override
    void setFuelConsumption() {
        super.fuelConsumption += 0.9;
    }

    @Override
    void refuel(double liters) {
        super.fuelQuantity += liters;
    }
}
