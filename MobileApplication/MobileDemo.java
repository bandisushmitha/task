import java.util.Scanner;

public class MobileDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MobileApp app = new MobileApp();

        app.setAppName("Smart Travel");
        app.setLocation("Hyderabad, Telangana");

        while (true) {

            System.out.println("================================");
            System.out.println("       SMART TRAVEL APP");
            System.out.println("================================");
            System.out.println("1. View App Details");
            System.out.println("2. Get Current Location");
            System.out.println("3. Take Photo");
            System.out.println("4. Change Location");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }
            
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    app.displayAppDetails();
                    break;

                case 2:
                    app.getLocation();
                    break;

                case 3:
                    app.takePhoto();
                    break;

                case 4:
                    scanner.nextLine();
                    
                    System.out.print("Enter your new location: ");
                    
                    String newLocation = scanner.nextLine();
                    
                    app.setLocation(newLocation);
                    System.out.println("Location updated successfully!");
                    break;
                    
                case 5:
                    System.out.println("Thank you for using Smart Travel App!");
                    scanner.close();
                    return;
    

                default:
                    System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }
    }
}