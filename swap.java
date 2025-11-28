import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[3][3];
        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int temp = matrix[0][0];
        matrix[0][0] = matrix[1][1];
        matrix[1][1] = temp;
        System.out.println("Matrix after swapping:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

