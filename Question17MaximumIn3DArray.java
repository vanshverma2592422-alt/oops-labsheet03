package labsheet03;

import java.util.Scanner;

public class Question17MaximumIn3DArray {
    public int findMaximum(int[][][] numbers) {
        int maximum = numbers[0][0][0];
        for (int[][] layer : numbers) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > maximum) {
                        maximum = value;
                    }
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][][] numbers = new int[2][2][2];
            System.out.println("Enter 8 integers:");
            for (int layer = 0; layer < 2; layer++) {
                for (int row = 0; row < 2; row++) {
                    for (int column = 0; column < 2; column++) {
                        numbers[layer][row][column] = input.nextInt();
                    }
                }
            }
            System.out.println("Maximum: " + new Question17MaximumIn3DArray().findMaximum(numbers));
        }
    }
}