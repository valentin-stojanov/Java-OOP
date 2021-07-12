package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name){
        this.name = name;
    }

    private void setMoney(double money){
        this.money = money;
    }

    public void buyProduct (Product){

    }
}
