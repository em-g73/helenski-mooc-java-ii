package FlightControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        
        System.out.println("Airport Asset Control");
        
        while (true) {
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String input = scanner.nextLine();
            
            if (input.equals("1")) { // Airplane add
                System.out.println("Give the airplane id:");
                String id = scanner.nextLine();

                System.out.println("Give the airplane capacity:");
                int capacity = Integer.valueOf(scanner.nextLine());

                data.addPlane(id, capacity);

            } else if (input.equals("2")) { // Flight add
                System.out.println("Give the airplane id:");
                String planeId = scanner.nextLine();
                
                System.out.println("Give the departure airport id:");
                String departureId = scanner.nextLine();
                
                System.out.println("Give the target airport id: ");
                String targetId = scanner.nextLine();

                data.addFlight(planeId, departureId, targetId);

            } else if (input.equals("x")) { // Quit
                break;
                
            }
        }
        
        System.out.println("Flight Control");
        
        while (true) {
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String input = scanner.nextLine();
            
            if (input.equals("1")) { // Airplane print
                data.getPlanes().values().stream()
                        .forEach(plane -> {System.out.println(plane);});

            } else if (input.equals("2")) { // Flight print
                data.getFlights().values().stream()
                        .forEach(flight -> {System.out.println(flight);});

            } else if (input.equals("3")) { // Airplane details print
                System.out.println("Give the airplane id:");
                input = scanner.nextLine();
                
                System.out.println(data.getPlane(input));
            
            } else if (input.equals("x")) { // Quit
                break;
                
            }
        }
    }
}
