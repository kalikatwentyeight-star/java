import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Check for a number
        System.out.print("Enter number to check: ");
        int check = sc.nextInt();
        
        // Search and display
        boolean found = false;
        for(int i = 0; i < 10; i++) {
            if(arr[i] == check) {
                System.out.println(check);
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("false");
        }
        
        sc.close();
    }
}
