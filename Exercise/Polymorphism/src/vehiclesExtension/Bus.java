package vehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    private static final double FUEL_CONSUMPTION_AC = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double capacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_AC, capacity);
    }

    public void driveEmpty(double kilometers) {
        double emptyConsumption = super.fuelConsumption - FUEL_CONSUMPTION_AC;
        if (emptyConsumption * kilometers > fuelQuantity) {
            System.out.printf("%s needs refueling%n", getClass().getSimpleName());
        } else {
            fuelQuantity -= emptyConsumption * kilometers;
            System.out.printf("%s travelled %s km%n", getClass().getSimpleName(), new DecimalFormat("#.##").format(kilometers));
        }
    }
}
