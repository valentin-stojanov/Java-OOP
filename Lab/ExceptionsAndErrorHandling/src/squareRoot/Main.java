package squareRoot;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        try {
            System.out.println(calculateSqrt(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good bye");
        }

    }

    private static double calculateSqrt(String number) {
        double result;
        try {
            int num = Integer.parseInt(number);
            if (num < 0){
                throw new IllegalArgumentException("Invalid number");
            }
            return result = Math.sqrt(num);
        } catch (NumberFormatException e) {

            throw new IllegalArgumentException("Invalid number");
        }
    }
}
