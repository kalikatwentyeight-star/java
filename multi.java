
import java.util.Scanner;

public class multi {
    public static void main(String args[])
    {
        int i, j,  a=0;
        int [] [] arr =new int[2][2];
        Scanner ob =new Scanner (System.in);
        System.out.println("enter elements or array ");
        for(i=0;i<arr.length;i++)
        {
            for (j=0;j<arr.length;j++){
                arr [i] [j] =ob.nextInt();

            }
        }
        System.out.println("enter the element of array are ");
        for(i=0;i<arr.length;i++)
        {
            for (j=0;j<arr.length;j++)
            {
                System.out.println(arr [i] [j] );

            }
        }
        System.out.println("enter the  replace do you want");
        a=ob.nextInt();
        for (i=0;i<arr.length;i++)
        {
            for (j=0;j<arr.length;j++)
            {
                if (arr[i] [j] ==a)
                {
                    System.out.println("found ");
                }

            }

        }

    }
}
