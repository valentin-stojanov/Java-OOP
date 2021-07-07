package StudentSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static Scanner scanner = new Scanner(System.in);

    public static String[] readStringArray(){
        return scanner.nextLine().split("\\s+");
    }
}

