import java.util.Scanner;

public class cha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.out.println())
        // Ask user to input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Print the character
        System.out.println("You entered: " + ch);

        // Print characters from 'A' to the entered character using a loop
        System.out.println("Characters from 'A' to '" + ch + "':");
        for (char c = 'A'; c <= ch; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}
