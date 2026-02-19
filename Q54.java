import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        int array[] = new int[5];

        for (int i : array) {
            array[i] = input.nextInt();
        }

        //print
        System.out.println(array);

        input.close();
    }
}
