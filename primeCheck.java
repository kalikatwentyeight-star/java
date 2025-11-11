import java.util.Scanner();
public class primeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the one number");
        int num = sc.nextInt();
        boolean prime = true;
        
        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        
        if (prime) {
            System.out.println("this is prime number");
        } else {
            System.out.println("this is not prime number"); 
        }
    }
}
