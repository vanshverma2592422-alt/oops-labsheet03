package labsheet03;

import java.util.Scanner;

public class Question30SparseMatrix {
    public void check(int[][] matrix) {
        int zeros = 0;
        int nonZeros = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }
        System.out.println("Zero elements: " + zeros);
        System.out.println("Non-zero elements: " + nonZeros);
        if (zeros > nonZeros) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter row and column counts: ");
            int rows = input.nextInt();
            int columns = input.nextInt();
            if (rows <= 0 || columns <= 0) {
                System.out.println("Dimensions must be positive.");
                return;
            }
            int[][] matrix = new int[rows][columns];
            System.out.println("Enter matrix elements row by row:");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            new Question30SparseMatrix().check(matrix);
        }
    }
}