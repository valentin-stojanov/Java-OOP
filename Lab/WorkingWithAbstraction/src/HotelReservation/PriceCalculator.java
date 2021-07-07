package HotelReservation;

public class PriceCalculator {
    //pricePerDay, numberOfDays, season, discountType
    private double pricePerDay;
    private int numberOfDays;
    private Seasons season;
    private DiscountType discount;

    public PriceCalculator(double pricePerDay, int numberOfDays, String season, String discount) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = Seasons.valueOf(season);
        this.discount = DiscountType.valueOf(discount);
    }

    public double calculate() {
        return this.numberOfDays *
                this.pricePerDay *
                this.season.getMultiplierPerDay() *
                this.discount.getPercentDiscount();
    }
}
