package ShoppingSpree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private Validator(){

    }

    public static boolean validateName(String name){
//        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher(name);
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return true;
    }

    public static boolean validateMoney(double money){
        if (money > 0){
            return true;
        }
        throw new IllegalArgumentException("Money cannot be negative");
    }
}
