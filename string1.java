public class string1 {
    public static void main(String[] args) {

        String name = "kalika";
        char[] arr = name.toCharArray();

        
        System.out.println("Characters:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = reverse + arr[i];
        }

        System.out.println("Reversed: " + reverse);

        if (name.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
