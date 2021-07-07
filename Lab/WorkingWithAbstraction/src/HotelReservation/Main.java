package HotelReservation;

public class Main {
    public static void main(String[] args) {

        String[] tokens = Reader.readArray("\\s+");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int numberOfDays = Integer.parseInt(tokens[1]);
        String season = tokens[2];
        String discountType = tokens[3];

        PriceCalculator calculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        double price = calculator.calculate();

        System.out.printf("%.2f", price);

    }

}
