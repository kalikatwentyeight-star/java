public class brecon {

    public static void main(String[] args) {
   
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        for (int num : numbers) {
     
            if (num % 2 == 0) {
                continue;
            }
          
            if (num == 7) {
                break;
            }
           
            System.out.println("Number: " + num);
        }
    }
}
