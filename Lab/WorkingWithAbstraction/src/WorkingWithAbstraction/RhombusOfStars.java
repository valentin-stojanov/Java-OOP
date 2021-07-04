package WorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {

    public static void main(String[] args) {
        int size = readInput();
        String rhombOfStars = buildRohombOfStars(size);
        printOutput(rhombOfStars);
    }

    private static void printOutput(String rhombOfStars) {
        System.out.println(rhombOfStars);
    }

    private static String buildRohombOfStars(int size) {
        StringBuilder out = new StringBuilder();
        for (int r = 1; r <= size; r++) {
            out.append(printLine(size-r, r))
                    .append(System.lineSeparator());
        }

        for (int r = size-1; r >= 1; r--) {
            out.append(printLine(size-r, r))
                    .append(System.lineSeparator());
        }
        return out.toString();
    }

    private static String printLine(int spaces, int stars) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            out.append(" ");
        }
        for (int i = 0; i < stars; i++) {
            out.append(" *");
        }
        return out.toString();
    }

    private static int readInput() {
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}
