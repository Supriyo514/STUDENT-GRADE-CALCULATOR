
import java.util.Scanner;

public class gradecalculator {

    public static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return ((double) totalMarks / (numSubjects * 100)) * 100;
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] subjectMarks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        int totalMarks = calculateTotalMarks(subjectMarks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        char grade = calculateGrade(averagePercentage);
        displayResults(totalMarks, averagePercentage, grade);

        scanner.close();
    }
}
