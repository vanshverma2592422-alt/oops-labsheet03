package labsheet03;

import java.util.Scanner;

public class Question20StudentMarksJaggedArray {
    public void displayMarks(int[][] marks) {
        for (int student = 0; student < marks.length; student++) {
            System.out.print("Student " + (student + 1) + " marks: ");
            for (int mark : marks[student]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int students = input.nextInt();
            if (students <= 0) {
                System.out.println("Number of students must be positive.");
                return;
            }
            int[][] marks = new int[students][];
            for (int student = 0; student < students; student++) {
                System.out.print("How many subjects for student " + (student + 1) + "? ");
                int subjects = input.nextInt();
                if (subjects <= 0) {
                    System.out.println("Subject count must be positive.");
                    return;
                }
                marks[student] = new int[subjects];
                System.out.println("Enter " + subjects + " marks:");
                for (int subject = 0; subject < subjects; subject++) {
                    marks[student][subject] = input.nextInt();
                }
            }
            new Question20StudentMarksJaggedArray().displayMarks(marks);
        }
    }
}