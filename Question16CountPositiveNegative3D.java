package labsheet03;

import java.util.Scanner;

public class Question16CountPositiveNegative3D {
    public void countNumbers(int[][][] numbers) {
        int positive = 0;
        int negative = 0;
        for (int[][] layer : numbers) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > 0) {
                        positive++;
                    } else if (value < 0) {
                        negative++;
                    }
                }
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
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
            new Question16CountPositiveNegative3D().countNumbers(numbers);
        }
    }
}