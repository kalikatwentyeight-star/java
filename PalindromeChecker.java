public class PalindromeChecker {
    public static void main(String[] args) {
        String name = "madam";
        int count = 0;

        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}