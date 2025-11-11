// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;


public class factorial {
   public factorial() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int var2 = var1.nextInt();
      int var3 = 1;

      for(int var4 = 1; var4 <= var2; ++var4) {
         var3 *= var4;
      }

      System.out.println("Factorial of " + var2 + " is " + var3);
   }
}
