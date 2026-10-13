package labsheet03;

import java.util.Scanner;

public class Question25DiagonalSums {
    public void displaySums(int[][] matrix) {
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int index = 0; index < matrix.length; index++) {
            mainDiagonal += matrix[index][index];
            secondaryDiagonal += matrix[index][matrix.length - 1 - index];
        }
        System.out.println("Main diagonal sum: " + mainDiagonal);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonal);
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
            new Question25DiagonalSums().displaySums(matrix);
        }
    }
}