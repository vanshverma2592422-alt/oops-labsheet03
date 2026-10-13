package labsheet03;

import java.util.Scanner;

public class Question27MatrixBoundary {
    public void displayBoundary(int[][] matrix) {
        System.out.println("Boundary elements (interior positions are shown as .):");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                boolean isBoundary = row == 0 || row == matrix.length - 1
                        || column == 0 || column == matrix[row].length - 1;
                System.out.print((isBoundary ? matrix[row][column] : ".") + " ");
            }
            System.out.println();
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
            new Question27MatrixBoundary().displayBoundary(matrix);
        }
    }
}