package labsheet03;

import java.util.Scanner;

public class Question03ArraySum {
    public int findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
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
            System.out.println("Sum: " + new Question03ArraySum().findSum(numbers));
        }
    }
}