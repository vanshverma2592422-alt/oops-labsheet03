package labsheet03;

import java.util.Scanner;

public class Question28SearchMatrix {
    public void search(int[][] matrix, int target) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == target) {
                    System.out.println("Found at row " + (row + 1) + ", column " + (column + 1));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
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
            System.out.print("Enter value to search for: ");
            int target = input.nextInt();
            new Question28SearchMatrix().search(matrix, target);
        }
    }
}