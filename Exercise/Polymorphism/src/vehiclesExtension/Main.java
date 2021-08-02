package vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] busInfo = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        vehicleMap.put("Car", car);
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(carInfo[3]));
        vehicleMap.put("Truck", truck);
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));
        vehicleMap.put("Bus", bus);



        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicleType = tokens[1];

            switch (vehicleType) {
                case "Car":
                    if (command.equals("Drive")) {
                        double kilometers = Double.parseDouble(tokens[2]);
                        car.drive(kilometers);
                    } else if (command.equals("Refuel")) {
                        double liters = Double.parseDouble(tokens[2]);
                        car.refuel(liters);
                    }
                    break;
                case "Truck":
                    if (command.equals("Drive")) {
                        double kilometers = Double.parseDouble(tokens[2]);
                        truck.drive(kilometers);
                    } else if (command.equals("Refuel")) {
                        double liters = Double.parseDouble(tokens[2]);
                        truck.refuel(liters);
                    }
                    break;
                case "Bus":
                    if (command.equals("Drive")) {
                        double kilometers = Double.parseDouble(tokens[2]);
                        bus.drive(kilometers);
                    } else if (command.equals("Refuel")) {
                        double liters = Double.parseDouble(tokens[2]);
                        bus.refuel(liters);
                    }else if (command.equals("DriveEmpty")){
                        double kilometers = Double.parseDouble(tokens[2]);
                        bus.driveEmpty(kilometers);
                    }
                    break;
            }
        }

        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }


    }
}
