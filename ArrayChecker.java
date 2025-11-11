import java.util.Scanner;

public class ArrayChecker {
    private int[] array;
    private int size;
    
    // Constructor to initialize array with size 10
    public ArrayChecker() {
        this.size = 10;
        this.array = new int[10];
    }
    
   
    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 values for the array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    
    
    public void displayArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    // Method to check if array contains a specific value
    public boolean contains(int value) {
        for (int i = 0; i < 10; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
    
    // Method to find and print the index of a value
    public void findNumber(int value) {
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] == value) {
                System.out.println("Number " + value + " found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayChecker checker = new ArrayChecker();
        
        // Input values
        checker.inputValues();
        
        // Display the array
        checker.displayArray();
        
        // Ask user for number to check
        System.out.print("Enter a number to check in the array: ");
        int numberToCheck = scanner.nextInt();
        
        // Check and display result
        checker.findNumber(numberToCheck);
        
        scanner.close();
    }
}
