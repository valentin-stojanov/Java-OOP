package restaurant.entities.tables.interfaces;

import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;

import java.util.Collection;

import static restaurant.common.ExceptionMessages.*;

public abstract class BaseTable implements Table{

    private Collection<HealthyFood> healthyFood;
    private Collection<Beverages> beverages;
    private int number;
    private int size;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReservedTable;
    private double allPeople;

    protected BaseTable(int number, int size, double pricePerPerson) {
        this.number = number;
        this.setSize(size);
        this.pricePerPerson = pricePerPerson;
    }

    private void setSize(int size){
        if (size <= 0){ //Possible mistake!!!
            throw new IllegalArgumentException(INVALID_TABLE_SIZE);
        }
    }

    private void setNumberOfPeople(int numberOfPeople){
        if (numberOfPeople <= 0){
            throw new IllegalArgumentException(INVALID_NUMBER_OF_PEOPLE);
        }
    }

    @Override
    public int getTableNumber() {
        return this.number;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int numberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double pricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReservedTable() {
        return false;
    }

    @Override
    public double allPeople() {
        return 0;
    }

    @Override
    public void reserve(int numberOfPeople) {

    }

    @Override
    public void orderHealthy(HealthyFood food) {

    }

    @Override
    public void orderBeverages(Beverages beverages) {

    }

    @Override
    public double bill() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String tableInformation() {
        return null;
    }
}
