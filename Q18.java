import java.text.DecimalFormat;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("");

        System.out.print("=============Quizes============\nEnter first quize : ");
        int q1 = input.nextInt();
        System.out.print("Enter second quize : ");
        int q2 = input.nextInt();
        System.out.print("Enter third quize : ");
        int q3 = input.nextInt();
        System.out.println("=============Mid-term============");
        System.out.print("Enter the score mid-term : ");
        int mid = input.nextInt();
        System.out.println("=============Final============");
        System.out.print("Enter the score final : ");
        int fin = input.nextInt();
        System.out.println("=============Results============");
        int q_total = q1 + q2 + q3;
        System.out.println("Quiz Total :" + q_total);
        System.out.println("Mid-term :" + mid);
        System.out.println("Final :" + fin);
        System.out.println("=============Total============");
        int total = q_total + mid + fin;
        double avg = (double) total / 500 * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(total + " from 500 (" + df.format(avg) + "%)");

    }
}
