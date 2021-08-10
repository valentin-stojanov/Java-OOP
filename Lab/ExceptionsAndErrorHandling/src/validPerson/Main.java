package validPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Student student = new Student("Gosho4", "iuaqdh@laqkfdqa.cfu");
        } catch (InvalidPersonNameException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static Person createPerson(String firstName, String lastName, int age) {
        return new Person(firstName, lastName, age);
    }
}
