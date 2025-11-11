import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) {
            System.out.print("Number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Kun chaiyo van?: ");
        int check = sc.nextInt();
        
        int found = 0;
        for(int i = 0; i < 10; i++) {
            if(arr[i] == check) {
                System.out.println("Yehhh! Vetiyoo"+check);
                found = 1;
                break;
            }
        }
        
        if(found == 0) {
            System.out.println("Xaina yo number");
        }
        
        sc.close();
    }
}
