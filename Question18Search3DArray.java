package labsheet03;

import java.util.Scanner;

public class Question18Search3DArray {
    public void search(int[][][] numbers, int target) {
        for (int layer = 0; layer < numbers.length; layer++) {
            for (int row = 0; row < numbers[layer].length; row++) {
                for (int column = 0; column < numbers[layer][row].length; column++) {
                    if (numbers[layer][row][column] == target) {
                        System.out.println("Found at layer " + (layer + 1) + ", row " + (row + 1)
                                + ", column " + (column + 1));
                        return;
                    }
                }
            }
        }
        System.out.println("Element not found.");
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
            System.out.print("Enter value to search for: ");
            int target = input.nextInt();
            new Question18Search3DArray().search(numbers, target);
        }
    }
}