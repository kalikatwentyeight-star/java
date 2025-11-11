import java.util.Scanner;

public class CharProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

