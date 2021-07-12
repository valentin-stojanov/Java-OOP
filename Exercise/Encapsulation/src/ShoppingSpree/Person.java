package ShoppingSpree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
        Validator.validateName(name);
        this.name = name;
    }

    private void setMoney(double money){
        Validator.validateMoney(money);
        this.money = money;
    }

    public void buyProduct (Product product){
        if (canAfford(product.getCost())){
            this.products.add(product);
            this.money -= product.getCost();
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
        }else{
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
        }
    }

    private boolean canAfford(double cost) {
        if (cost > this.money){
            return false;
        }
        return true;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        String products = this.products.isEmpty()
                ? "Nothing bought"
                :this.products
                .stream()
                .map(p -> String.valueOf(p.getName()))
                .collect(Collectors.joining(", "));

        return String.format("%s - %s", this.getName(), products);
    }
}
