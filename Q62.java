import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Q62 {

    // Helper method to display all student records
    public static void viewAllRecords(String[] ids, Map<String, int[]> studentScores) {
        System.out
                .println("==========================================================================================");
        System.out.println("| Student ID        | Quiz 1        | Quiz 2        | Mid-Term      | Final         |");
        System.out
                .println("==========================================================================================");

        for (String id : ids) {
            int[] scores = studentScores.get(id);
            // FIXED: Use specific indices (0 through 3) for each score
            System.out.printf("| %-17s | %-13d | %-13d | %-13d | %-13d |\n",
                    id,
                    scores[0], // Accessing the first score
                    scores[1], // Accessing the second score
                    scores[2], // Accessing the third score
                    scores[3] // Accessing the fourth score (Final)
            );
        }
        System.out
                .println("==========================================================================================");
    }

    // Helper method for option 2 (Viewing a single student by ID)
    public static void viewRecordByID(Scanner input, Map<String, int[]> studentScores) {
        System.out.println("Enter the Student ID to view records:");
        String searchId = input.next();

        if (studentScores.containsKey(searchId)) {
            int[] scores = studentScores.get(searchId);
            System.out.println("===========================================================");
            System.out.println("Records for Student ID: " + searchId);
            // FIXED: Use specific indices (0 through 3)
            System.out.printf("Quiz 1: %d, Quiz 2: %d, Mid-Term: %d, Final: %d\n",
                    scores[0], scores[1], scores[2], scores[3]);
            System.out.println("===========================================================");
        } else {
            System.out.println("Error: Student ID " + searchId + " not found.");
        }
    }

    // Helper method for option 3 (Finding highest/lowest final scores)
    public static void showHighLowFinalScores(Map<String, int[]> studentScores) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String highestId = "";
        String lowestId = "";

        for (Map.Entry<String, int[]> entry : studentScores.entrySet()) {
            String id = entry.getKey();
            int[] scores = entry.getValue();
            int finalScore = scores[3]; // FIXED: Access final score at index 3

            if (finalScore > highest) {
                highest = finalScore;
                highestId = id;
            }
            if (finalScore < lowest) {
                lowest = finalScore;
                lowestId = id;
            }
        }

        System.out.println("===========================================================");
        System.out.println("Highest Final Score: " + highest + " (Student ID: " + highestId + ")");
        System.out.println("Lowest Final Score: " + lowest + " (Student ID: " + lowestId + ")");
        System.out.println("===========================================================");
    }

    // Revised Helper method for Option 3: Finding highest/lowest for ALL
    // assessments
    public static void showHighLowScoresForAllAssessments(Map<String, int[]> studentScores) {
        // Arrays to store the extremes: {Quiz 1, Quiz 2, Mid-Term, Final}
        int[] highestScores = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        int[] lowestScores = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };

        // Maps to store which student achieved that score (optional, but useful)
        String[] highestIds = { "", "", "", "" };
        String[] lowestIds = { "", "", "", "" };

        for (Map.Entry<String, int[]> entry : studentScores.entrySet()) {
            String id = entry.getKey();
            int[] scores = entry.getValue();

            // Loop through all 4 assessment types (index 0 through 3)
            for (int i = 0; i < 4; i++) {
                if (scores[i] > highestScores[i]) {
                    highestScores[i] = scores[i];
                    highestIds[i] = id;
                }
                if (scores[i] < lowestScores[i]) {
                    lowestScores[i] = scores[i];
                    lowestIds[i] = id;
                }
            }
        }

        System.out.println("===========================================================");
        System.out.println("Extreme Scores Report:");
        System.out.println("===========================================================");
        System.out.printf("Quiz 1 Highest: %d (ID: %s) | Lowest: %d (ID: %s)\n",
                highestScores, highestIds, lowestScores, lowestIds);
        System.out.printf("Quiz 2 Highest: %d (ID: %s) | Lowest: %d (ID: %s)\n",
                highestScores, highestIds, lowestScores, lowestIds);
        System.out.printf("Mid-Term Highest: %d (ID: %s) | Lowest: %d (ID: %s)\n",
                highestScores, highestIds, lowestScores, lowestIds);
        System.out.printf("Final Highest: %d (ID: %s) | Lowest: %d (ID: %s)\n",
                highestScores, highestIds, lowestScores, lowestIds);
        System.out.println("===========================================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ids = { "1232", "1231", "5342", "1234" };
        Random random = new Random();

        Map<String, int[]> studentScores = new HashMap<>();
        for (String id : ids) {
            // FIX APPLIED: Inserted the required array dimension [4]
            int[] scoresArray = new int[4];
            scoresArray[0] = 40 + random.nextInt(60);
            scoresArray[1] = 40 + random.nextInt(60);
            scoresArray[2] = 40 + random.nextInt(60);
            scoresArray[3] = 40 + random.nextInt(60);
            studentScores.put(id, scoresArray);
        }

        // --- Main execution logic ---
        System.out.println("===========================================================");
        System.out.println("                             MENU");
        System.out.println("===========================================================");
        System.out.println("    1: View all students’ records ");
        System.out.println("    2: View a student’s records by ID ");
        System.out.println("    3: Show the highest and the lowest final scores ");
        System.out.println("Please enter your choice :");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                viewAllRecords(ids, studentScores);
                break;
            case 2:
                viewRecordByID(input, studentScores);
                break;
            case 3:
                showHighLowScoresForAllAssessments(studentScores);
                break;
            default:
                System.out.println("Invalid choice entered. Exiting program.");
                break;
        }

        input.close();
    }
}
