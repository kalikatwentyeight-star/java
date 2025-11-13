import java.util.Scanner;

public class MultiArraySearchUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        
        System.out.print("Enter the number you want to search: ");
        int search = sc.nextInt();

        System.out.print("Enter the new number to replace it with: ");
        int replace = sc.nextInt();

        boolean found = false;

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == search) {
                    arr[i][j] = replace;
                    found = true;
                    System.out.println("Replaced " + search + " with " + replace +
                                       " at position [" + i + "][" + j + "]");
                }
            }
        }

        
        if (!found) {
            System.out.println("Value not found in the array.");
        }

        
        System.out.println("\nUpdated Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
