package labsheet03;

import java.util.Scanner;

public class Question24RemoveDuplicates {
    public void removeAndDisplay(int[] numbers) {
        int[] unique = new int[numbers.length];
        int uniqueCount = 0;
        for (int number : numbers) {
            boolean found = false;
            for (int index = 0; index < uniqueCount; index++) {
                if (unique[index] == number) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = number;
                uniqueCount++;
            }
        }
        System.out.println("Array without duplicates:");
        for (int index = 0; index < uniqueCount; index++) {
            System.out.print(unique[index] + " ");
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
            new Question24RemoveDuplicates().removeAndDisplay(numbers);
        }
    }
}