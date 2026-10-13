package labsheet03;

import java.util.Scanner;

public class Question09RowSums {
    public void displayRowSums(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int value : matrix[row]) {
                sum += value;
            }
            System.out.println("Row " + (row + 1) + " sum: " + sum);
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
            new Question09RowSums().displayRowSums(matrix);
        }
    }
}