import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("******Welcome to the Hotel Menu system******");
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            int total = 0;
            
            switch (choice) {
                case 1:
                    System.out.println("how much plate do you want");
                    int plate = scanner.nextInt();
                    int price = 100;
                    if(plate >= 3) {
                        total = (plate * price) * 90 / 100;
                        System.out.println("your total bill is " + total);
                    } else {
                        total = plate * price;
                        System.out.println("your total price is " + total);
                    }
                    break;
                case 2:
                    System.out.println("how much plate do you want");
                    int plate2 = scanner.nextInt();
                    if(plate2 >= 3) {
                        total = (plate2 * 50) * 90 / 100;
                        System.out.println("your total bill is " + total);
                    } else {
                        total = plate2 * 50;
                        System.out.println("your total price is " + total);
                    }
                    break;
                case 3:
                     System.out.println("how much plate do you want");
                    int plate3 = scanner.nextInt();
                    if(plate3 >= 3) {
                        total = (plate3 * 20) * 90 / 100;
                        System.out.println("your total bill is " + total);
                    } else {
                        total = plate3 * 50;
                        System.out.println("your total price is " + total);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for visiting our hotel!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select between 1-4.");
            }
        }
    }
    
    private static void displayMenu() {
        System.out.println("\n=== Hotel Menu ===");
        System.out.println("1. MOMO");
        System.out.println("2. CHAUMIN");
        System.out.println("3. SAMOSA");
        System.out.println("4. Exit");
    }
}
