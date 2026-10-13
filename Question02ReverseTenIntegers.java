package labsheet03;

import java.util.Scanner;

public class Question02ReverseTenIntegers {
    public void displayReverse(int[] numbers) {
        System.out.println("Integers in reverse order:");
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.println(numbers[index]);
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[10];
            System.out.println("Enter 10 integers:");
            for (int index = 0; index < numbers.length; index++) {
                numbers[index] = input.nextInt();
            }
            new Question02ReverseTenIntegers().displayReverse(numbers);
        }
    }
}