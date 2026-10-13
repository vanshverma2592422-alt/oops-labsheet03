package labsheet03;

import java.util.Scanner;

public class Question22ElementFrequency {
    public void displayFrequencies(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            boolean counted = false;
            for (int previous = 0; previous < index; previous++) {
                if (numbers[previous] == numbers[index]) {
                    counted = true;
                    break;
                }
            }
            if (!counted) {
                int count = 0;
                for (int number : numbers) {
                    if (number == numbers[index]) {
                        count++;
                    }
                }
                System.out.println(numbers[index] + " appears " + count + " time(s).");
            }
        }
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
            new Question22ElementFrequency().displayFrequencies(numbers);
        }
    }
}