public class SecondLargestUsingLoop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int secondLargest = arr[arr.length - 2];
        System.out.println("\nSecond largest: " + secondLargest);
    }
}
