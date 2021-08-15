package restaurant.repositories.interfaces;

import restaurant.entities.drinks.interfaces.Beverages;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BeveragesRepositoryImpl<T> implements BeverageRepository{

    private Map<String, Beverages> entities;

    private BeveragesRepositoryImpl() {
        this.entities = new LinkedHashMap<>();
    }

    @Override
    public Beverages beverageByName(String drinkName, String drinkBrand) {
        return null;
    }

    @Override
    public Collection getAllEntities() {
        return null;
    }

    @Override
    public void add(Object entity) {

    }
}
