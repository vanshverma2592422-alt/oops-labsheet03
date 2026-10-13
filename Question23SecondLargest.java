package labsheet03;

import java.util.Scanner;

public class Question23SecondLargest {
    public void findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = 0;
        boolean hasSecondLargest = false;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
                hasSecondLargest = true;
            } else if (number < largest && (!hasSecondLargest || number > secondLargest)) {
                secondLargest = number;
                hasSecondLargest = true;
            }
        }
        if (hasSecondLargest) {
            System.out.println("Second largest distinct value: " + secondLargest);
        } else {
            System.out.println("There is no second distinct value.");
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
            new Question23SecondLargest().findSecondLargest(numbers);
        }
    }
}