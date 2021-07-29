package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    void drive(double kilometers) {
        if (fuelConsumption * kilometers > fuelQuantity) {
            System.out.printf("%s needs refueling%n", getClass().getSimpleName());
        } else {
            fuelQuantity -= fuelConsumption * kilometers;
            System.out.printf("%s travelled %s km%n", getClass().getSimpleName(), new DecimalFormat("#.##").format(kilometers));
        }
    }

    abstract void refuel(double liters);

    abstract void setFuelConsumption();

    @Override
   public String toString(){

        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity );
    }
}
