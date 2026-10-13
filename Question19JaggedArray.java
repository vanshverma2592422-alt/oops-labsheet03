package labsheet03;

import java.util.Scanner;

public class Question19JaggedArray {
    public void display(int[][] numbers) {
        System.out.println("Jagged array:");
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] numbers = new int[3][];
            for (int row = 0; row < numbers.length; row++) {
                System.out.print("Enter length of row " + (row + 1) + ": ");
                int length = input.nextInt();
                if (length <= 0) {
                    System.out.println("Row length must be positive.");
                    return;
                }
                numbers[row] = new int[length];
                System.out.println("Enter " + length + " integers:");
                for (int column = 0; column < length; column++) {
                    numbers[row][column] = input.nextInt();
                }
            }
            new Question19JaggedArray().display(numbers);
        }
    }
}