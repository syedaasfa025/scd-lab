import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        char grade;
        double gpa;
        if (percentage >= 90) {
            grade = 'A';
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = 'B';
            gpa = 3.5;
        } else if (percentage >= 70) {
            grade = 'C';
            gpa = 3.0;
        } else if (percentage >= 60) {
            grade = 'D';
            gpa = 2.5;
        } else {
            grade = 'F';
            gpa = 0.0;
        }

        System.out.println("\nMarksheet:");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}
