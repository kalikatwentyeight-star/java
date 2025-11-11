import java.util.Scanner;

public class armstrong {
   public armstrong() {
   }

   public static void main(String[] args) {
      int sum = 0;
      System.out.println("Enter the three digit number:");
       try (Scanner scanner = new Scanner(System.in)) {
           int number = scanner.nextInt();
           
           for(int temp = number; temp != 0; temp /= 10) {
               int digit = temp % 10;
               sum += digit * digit * digit;
           }
           
           if (sum == number) {
               System.out.println(number + " is an Armstrong number");
           } else {
               System.out.println(number + " is not an Armstrong number");
           }}
   }
}
