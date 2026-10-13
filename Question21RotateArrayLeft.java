package labsheet03;

import java.util.Scanner;

public class Question21RotateArrayLeft {
    public void rotateAndDisplay(int[] numbers) {
        int first = numbers[0];
        for (int index = 0; index < numbers.length - 1; index++) {
            numbers[index] = numbers[index + 1];
        }
        numbers[numbers.length - 1] = first;
        System.out.println("Array after left rotation:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
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
            new Question21RotateArrayLeft().rotateAndDisplay(numbers);
        }
    }
}