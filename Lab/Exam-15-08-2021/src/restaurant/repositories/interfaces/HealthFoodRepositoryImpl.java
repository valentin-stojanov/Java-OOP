package restaurant.repositories.interfaces;

import restaurant.entities.drinks.interfaces.Beverages;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class HealthFoodRepositoryImpl implements HealthFoodRepository{

    private Map<String, Beverages> entities;

    private HealthFoodRepositoryImpl() {
        this.entities = new LinkedHashMap<>();
    }

    @Override
    public Object foodByName(String name) {
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
