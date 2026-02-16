
//Scanner...
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for the sum and the current input number
        int sum = 0;
        int input;

        System.out.println("Enter integers to sum (enter 0 to stop):");

        // Use a do-while loop to ensure at least one prompt
        do {
            // Read the next integer from the user
            input = scanner.nextInt();

            // Add the entered number to the total sum
            sum += input;

            System.out.println("The summation of all entered numbers is: " + (sum));
        } while (input != 0);

        // Close the scanner to prevent resource leaks
        scanner.close();

    }

}
