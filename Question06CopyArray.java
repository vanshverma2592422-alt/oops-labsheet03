package labsheet03;

import java.util.Scanner;

public class Question06CopyArray {
    public void copyAndDisplay(int[] source) {
        int[] copy = new int[source.length];
        for (int index = 0; index < source.length; index++) {
            copy[index] = source[index];
        }
        System.out.println("Copied array:");
        for (int value : copy) {
            System.out.print(value + " ");
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
            int[] source = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (int index = 0; index < size; index++) {
                source[index] = input.nextInt();
            }
            new Question06CopyArray().copyAndDisplay(source);
        }
    }
}