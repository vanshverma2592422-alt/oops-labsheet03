package labsheet03;

import java.util.Scanner;

public class Question26TriangularParts {
    public void displayParts(int[][] matrix) {
        System.out.println("Upper triangular part:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print((column >= row ? matrix[row][column] : 0) + " ");
            }
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print((column <= row ? matrix[row][column] : 0) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter square matrix size: ");
            int size = input.nextInt();
            if (size <= 0) {
                System.out.println("Matrix size must be positive.");
                return;
            }
            int[][] matrix = new int[size][size];
            System.out.println("Enter " + (size * size) + " elements:");
            for (int row = 0; row < size; row++) {
                for (int column = 0; column < size; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            new Question26TriangularParts().displayParts(matrix);
        }
    }
}