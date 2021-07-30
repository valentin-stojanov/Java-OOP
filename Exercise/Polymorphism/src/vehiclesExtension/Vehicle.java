package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    private double capacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double capacity) {
        this.setFuelQuantity(fuelQuantity);
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
       if (fuelQuantity <= 0){
           System.out.println("Fuel must be a positive number");
       }else{
           this.fuelQuantity = fuelQuantity;
       }
    }

    void drive(double kilometers) {
        if (fuelConsumption * kilometers > fuelQuantity) {
            System.out.printf("%s needs refueling%n", getClass().getSimpleName());
        } else {
            fuelQuantity -= fuelConsumption * kilometers;
            System.out.printf("%s travelled %s km%n", getClass().getSimpleName(), new DecimalFormat("#.##").format(kilometers));
        }
    }

    void refuel(double liters){
        double totalLiters = liters + this.fuelQuantity;
        if ( liters <=0){
            System.out.println("Fuel must be a positive number");
        }else if ( 0 <= totalLiters && totalLiters <= capacity){
            this.fuelQuantity += liters;
        }else{
            System.out.println("Cannot fit fuel in tank");
        }
    }


    @Override
   public String toString(){

        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity );
    }


}
