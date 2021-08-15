package restaurant.entities.drinks.interfaces;

public class Fresh extends BaseBeverage{

    private static final double FRESH_PRICE = 3.50;

    public Fresh(String name, int counter, double price, String brand) {
        super(name, counter, FRESH_PRICE, brand);
    }
}
