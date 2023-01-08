import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the names and marks.
        Scanner scanner = new Scanner(System.in);

        // Stores the name.
        String name = scanner.nextLine();

        // Stores the marks.
        int marks = scanner.nextInt();

        // Stores the grade.
        char grade;

        // Checks the marks.
        if (marks > 100) {
            grade = 'A';
        } else if (marks > 80) {
            grade = 'B';
        } else if (marks > 60) {
            grade = 'C';
        } else if (marks > 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Prints the result.
        System.out.println("The grade scored by " + name + " is " + grade);
    }
}