public class primeCc
 {
    public static void main(String[] args) 
    {
        int pri=5;
        int i,counter=0;
        for(i=1;i<=pri;i++)
        {
            if(pri%i==0)
            {
                counter++;
            }
        }
        if(counter==2)
        {
            System.out.println("Number is prime"+pri);
        }
        else
        {
           System.out.println("Number is not prime"+pri); 
        }
    }
}
