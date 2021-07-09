package TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLight[] trafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf)
                .toArray(TrafficLight[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < trafficLights.length; j++) {
               trafficLights[j] = TrafficLight.change(trafficLights[j]);
                System.out.print(trafficLights[j] + " ");
            }
            System.out.println();
        }

    }


}
