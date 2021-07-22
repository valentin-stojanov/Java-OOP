package carShop;

public class Seat implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProducer;

    public Seat(String model, String color, Integer horsePower, String countryProducer){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProducer() {
        return countryProducer;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires",
                this.model, this.countryProducer, Car.TIRES);
    }
}
