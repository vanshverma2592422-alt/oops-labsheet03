package labsheet03;

import java.util.Arrays;
import java.util.Scanner;

public class Question29SortJaggedRows {
    public void sortAndDisplay(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            Arrays.sort(numbers[row]);
            System.out.print("Row " + (row + 1) + ": ");
            for (int value : numbers[row]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();
            if (rows <= 0) {
                System.out.println("Number of rows must be positive.");
                return;
            }
            int[][] numbers = new int[rows][];
            for (int row = 0; row < rows; row++) {
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
            new Question29SortJaggedRows().sortAndDisplay(numbers);
        }
    }
}