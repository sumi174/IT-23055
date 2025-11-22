import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ParkingPool pool = new ParkingPool();

        new ParkingAgent("Agent-1", pool).start();
        new ParkingAgent("Agent-2", pool).start();
        new ParkingAgent("Agent-3", pool).start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Parking System Started ===");
        System.out.println("Press ENTER to add parking request, -1 to exit");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                System.out.println("Shutting down...");
                break;
            }

            RegistrarParking parking = new RegistrarParking();
            pool.addParkingRequest(parking);
        }

        scanner.close();
    }
}

