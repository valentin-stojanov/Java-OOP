package carShop;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProducer, Double price){
        super(model, color, horsePower, countryProducer);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires%n%s sells for %f",
                getModell(), countryProducer(), Car.TIRES, getModell(), getPrice());
    }
}
