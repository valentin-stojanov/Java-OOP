package vehiclesExtension;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] buskInfo = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(carInfo[3]));
        Bus bus = new Bus(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(carInfo[3]));

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

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());


    }
}
