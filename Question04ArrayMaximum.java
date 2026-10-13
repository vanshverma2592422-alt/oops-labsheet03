package labsheet03;

import java.util.Scanner;

public class Question04ArrayMaximum {
    public int findMaximum(int[] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = input.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }
            int[] numbers = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (int index = 0; index < size; index++) {
                numbers[index] = input.nextInt();
            }
            System.out.println("Maximum: " + new Question04ArrayMaximum().findMaximum(numbers));
        }
    }
}