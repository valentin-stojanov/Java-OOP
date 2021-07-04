package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleCoordinates = readCoordinates(scanner);

        int x1 = rectangleCoordinates[0];
        int y1 = rectangleCoordinates[1];
        int x2 = rectangleCoordinates[2];
        int y2 = rectangleCoordinates[3];

        Rectangle rectangle = new Rectangle(x1, x2, y1, y2);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = readCoordinates(scanner);

            int x = pointCoordinates[0];
            int y = pointCoordinates[1];

            Point point = new Point(x, y);
            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] readCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
