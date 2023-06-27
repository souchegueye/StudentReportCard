package project2;

import java.util.Scanner;

public class StudentReportCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student's id: ");
        String id = scanner.nextLine();

        System.out.println("Enter student's branch: ");
        String branch = scanner.nextLine();

        System.out.println("Enter student's semester: ");
        int semester = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the subject names separated by commas: ");
        String subjectsInput = scanner.nextLine();
        String[] subjects = subjectsInput.split(",");

        int[] marks = new int[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averageMarks = (double) totalMarks / subjects.length;

        String grade = calculateGrade(averageMarks);

        System.out.println("\n*************** Report Card ***************");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f\n", averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("***************************************");
    }

    public static String calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return "A+";
        } else if (averageMarks >= 80) {
            return "A";
        } else if (averageMarks >= 70) {
            return "B";
        } else if (averageMarks >= 60) {
            return "C";
        } else if (averageMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
