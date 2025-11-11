import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int a[]= new int[5];
        int i;
        Scanner ob= new Scanner(System.in);
        for (i=0;i<5;i++){
            System.out.println("Enter a value");
            a[i]=ob.nextInt();
        
        }
        for (i=0;i<5;i++){
            System.out.println("You entered "+a[i]);
        }
    }
}