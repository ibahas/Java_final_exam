import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // aX2+bX+c=0
       // System.out.println("Give me X2");
        // double x2 = input.nextDouble();
        //System.out.println("Give me X");
       // double x = input.nextDouble();

        System.out.println("Give me C :");
        double c = input.nextDouble();
        System.out.println("Give me b :");
        double b = input.nextDouble();
        System.out.println("Give me a :");
        double a = input.nextDouble();

        double m = b * 2 - 4 * a * c;

        if (a == 0 && b == 0) {
            System.out.println("Error in inputs");
        } else if (a == 0) {
            System.out.println("Liner eq, there is one root " + -b / (2*a));
        } else if (m < 0) {
            System.out.println("No roots");
        } else if (m == 0) {
            System.out.println("one root " + (-b / (2 * a)));
        }else{
            double other = -b + Math.sqrt((m) / (2*a));
            double otherMin = -b - Math.sqrt((m) / (2*a));

            System.out.println("The roots are :" + other + "\n" + otherMin);

        }

        input.close();

    }
}
