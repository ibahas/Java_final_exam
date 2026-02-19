import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num. : ");
        int num = input.nextInt();
        System.out.print("Enter second num. : ");
        int num_1 = input.nextInt();

        System.out.println("Number adding is : " + (num + num_1));
        System.out.println("Number Sub is : " + (num - num_1));
        System.out.println("Number Multi is : " + (num * num_1));
        if ((num | num_1) != 0) {
            System.out.println("Number divid is : " + ((double) num / num_1));
        }

        input.close();

    }
}
