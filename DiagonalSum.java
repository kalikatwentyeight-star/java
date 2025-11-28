import java.util.Scanner;

public class DiagonalSum {

    public static int sumLeadingDiagonal(int[][] matrix) {
        int diagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix[i][i]; 
        }

        return diagonalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = sumLeadingDiagonal(matrix);
        System.out.println("Sum of the leading diagonal: " + diagonalSum);

        sc.close(); 
    }
}