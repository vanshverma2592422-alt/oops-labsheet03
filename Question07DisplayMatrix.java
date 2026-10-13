package labsheet03;

import java.util.Scanner;

public class Question07DisplayMatrix {
    public void display(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] matrix = new int[3][3];
            System.out.println("Enter 9 matrix elements:");
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            new Question07DisplayMatrix().display(matrix);
        }
    }
}