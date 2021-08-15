package restaurant.repositories.interfaces;

import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.tables.interfaces.Table;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class TableRepositoryImpl<T> implements TableRepository<Table> {

    private Collection<Table> entities;

    @Override
    public Collection<Table> getAllEntities() {
        return null;
    }

    @Override
    public void add(Table entity) {

    }

    @Override
    public Table byNumber(int number) {
        return null;
    }
}
