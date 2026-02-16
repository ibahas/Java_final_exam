
// 3 scores
// >= 90 and < 100 = A
// >= 70 and < 90 = B
// >= 50 and < 70 = C
// < 50 = F
// Else error avg.
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        double s1 = in.nextDouble();
        System.out.print("Enter score 2: ");
        double s2 = in.nextDouble();
        System.out.print("Enter score 3: ");
        double s3 = in.nextDouble();

        double avg = (s1 + s2 + s3) / 3.0;
        System.out.printf("Average = %.2f%n", avg);

        int bucket = (int) (avg / 10); // 0..10

        switch (bucket) {
            case 9:
                // 90..99 (and 99.999) => A (still < 100)
                if (avg < 100)
                    System.out.println("grade = A");
                else
                    System.out.println("error avg"); // avg == 100
                break;

            case 7:
                System.out.println("grade = B");
                break;

            case 5:
                System.out.println("grade = C");
                break;

            case 0:
                // لازم avg > 0 حسب السؤال
                if (avg > 0)
                    System.out.println("grade = F");
                else
                    System.out.println("error avg");
                break;

            default:
                // bucket=10 (avg=100..109) أو أي شيء خارج المتوقع
                System.out.println("error avg");
        }

        in.close();
    }
}
