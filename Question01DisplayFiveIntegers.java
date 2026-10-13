package labsheet03;

import java.util.Scanner;

public class Question01DisplayFiveIntegers {
    public void display(int[] numbers) {
        System.out.println("The integers are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[5];
            System.out.println("Enter 5 integers:");
            for (int index = 0; index < numbers.length; index++) {
                numbers[index] = input.nextInt();
            }
            new Question01DisplayFiveIntegers().display(numbers);
        }
    }
}