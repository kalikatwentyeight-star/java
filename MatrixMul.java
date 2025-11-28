import java.util.Scanner;

public class MatrixMul {

    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            return null;  
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        System.out.println("Enter the elements of the first 3x3 matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second 3x3 matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + (i+1) + "][" + (j+1) + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        int[][] result = multiply(A, B);

        if (result == null) {
            System.out.println("Matrices cannot be multiplied.");
        } else {
            System.out.println("Result of Matrix Multiplication:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close(); 
    }
}