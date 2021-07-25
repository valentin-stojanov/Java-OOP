package carShop;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProducer, Integer minRentDay, Double pricePerDay){
        super(model, color, horsePower, countryProducer);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString(){
       return String.format("This is %s produced in %s and have %d tires%n" +
               "Minimum rental period of %d days. Price per day %f",
               getModell(), countryProducer(), Car.TIRES, getMinRentDay(), getPricePerDay());
    }
}
