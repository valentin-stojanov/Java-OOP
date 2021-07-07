package HotelReservation;

import java.util.Scanner;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] readArray(String delimiter){
        return scanner.nextLine().split(delimiter);
    }
}
