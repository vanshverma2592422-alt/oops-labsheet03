package labsheet03;

import java.util.Scanner;

public class Question12AddMatrices {
    public void addAndDisplay(int[][] first, int[][] second) {
        System.out.println("Sum of matrices:");
        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < first[row].length; column++) {
                System.out.print((first[row][column] + second[row][column]) + " ");
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
            int[][] first = new int[rows][columns];
            int[][] second = new int[rows][columns];
            System.out.println("Enter first matrix:");
            readMatrix(input, first);
            System.out.println("Enter second matrix:");
            readMatrix(input, second);
            new Question12AddMatrices().addAndDisplay(first, second);
        }
    }

    private static void readMatrix(Scanner input, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
}