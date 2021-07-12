package ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> productsAndPrices = new LinkedHashMap<>();

        String[] clients = scanner.nextLine().split(";");
        for (String client : clients) {
            String[] clientInfo = client.split("=");
            String name = clientInfo[0];
            double money = Double.parseDouble(clientInfo[1]);

            try {
                Person person = new Person(name, money);
                people.put(person.getName(), person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String[] products = scanner.nextLine().split(";");
        for (String productAndCost : products) {
            String[] productInfo = productAndCost.split("=");
            String name = productInfo[0];
            double price = Double.parseDouble(productInfo[1]);
            try {
                Product product = new Product(name, price);
                productsAndPrices.put(product.getName(), product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];
            Product product = productsAndPrices.get(productName);

            if (people.containsKey(personName)) {
                people.get(personName).buyProduct(product);
            }
//            people.get(personName).buyProduct(productsAndPrices.get(productName));

            command = scanner.nextLine();
        }

        for (Person person : people.values()) {
            System.out.println(person.toString());
        }
    }
}
