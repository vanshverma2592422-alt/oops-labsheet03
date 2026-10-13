package labsheet03;

import java.util.Scanner;

public class Question14DisplayThreeDimensionalArray {
    public void display(int[][][] numbers) {
        for (int layer = 0; layer < numbers.length; layer++) {
            System.out.println("Layer " + (layer + 1) + ":");
            for (int[] row : numbers[layer]) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
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
            new Question14DisplayThreeDimensionalArray().display(numbers);
        }
    }
}