
// Got name and id of student.
// got num. or courses. max 5 courses.
// Set each score of course.
// >= 90 and < 100 = A
// >= 70 and < 90 = B
// >= 50 and < 70 = C
// < 50 = F
// Else error avg.
// and print :
// --------------------------------------------
// | name of student : ... | Id student : ... |
// --------------------------------------------
// | Course                | Score   | Grade  |
// --------------------------------------------
// | course 1              | Score   | Grade  |
// --------------------------------------------
// ...
// Then print : 
// Student : Ibrahim Ali Ibrahim Abu Hassanein.
import java.util.Scanner;

public class Q22Adv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input student name and ID
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter count of corses: ");

        // Input number of courses (max 5)
        System.out.print("Enter number of courses (max 5): ");
        int numCourses = input.nextInt();
        if (numCourses > 5 || numCourses <= 0) {
            System.out.println("Invalid number of courses. Exiting...");
            input.close();
            return;
        }

        String[] courses = new String[numCourses];
        double[] scores = new double[numCourses];
        char[] grades = new char[numCourses];

        // Input course names and scores
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter name of course " + (i + 1) + ": ");
            courses[i] = input.next();
            System.out.print("Enter score for " + courses[i] + ": ");
            scores[i] = input.nextDouble();

            // Determine grade based on score
            if (scores[i] >= 90 && scores[i] < 100) {
                grades[i] = 'A';
            } else if (scores[i] >= 70 && scores[i] < 90) {
                grades[i] = 'B';
            } else if (scores[i] >= 50 && scores[i] < 70) {
                grades[i] = 'C';
            } else if (scores[i] < 50 && scores[i] > 0) {
                grades[i] = 'F';
            } else {
                grades[i] = 'E'; // Error grade for invalid scores
            }
        }

        // Calculate average score
        double totalScore = 0;
        for (double score : scores) {
            totalScore += score;
        }
        double avg = totalScore / numCourses;

        // Print table
        System.out.println("--------------------------------------------");
        System.out.println("| Name of student : " + studentName + " | ID student : " + studentId + " |");
        System.out.println("--------------------------------------------");
        System.out.println("| Course                | Score   | Grade  |");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("| %-20s | %-7.2f | %-6s |\n", courses[i], scores[i], grades[i]);
        }
        System.out.println("--------------------------------------------");

        // Print average grade
        System.out.println("Average score: " + avg);
        System.out.println("Student: " + studentName);

        input.close();

    }
}
