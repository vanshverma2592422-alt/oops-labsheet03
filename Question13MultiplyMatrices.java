package labsheet03;

import java.util.Scanner;

public class Question13MultiplyMatrices {
    public void multiplyAndDisplay(int[][] first, int[][] second) {
        int[][] product = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                for (int index = 0; index < 3; index++) {
                    product[row][column] += first[row][index] * second[index][column];
                }
            }
        }
        System.out.println("Product:");
        for (int[] row : product) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] first = new int[3][3];
            int[][] second = new int[3][3];
            System.out.println("Enter first 3 x 3 matrix:");
            readMatrix(input, first);
            System.out.println("Enter second 3 x 3 matrix:");
            readMatrix(input, second);
            new Question13MultiplyMatrices().multiplyAndDisplay(first, second);
        }
    }

    private static void readMatrix(Scanner input, int[][] matrix) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
}