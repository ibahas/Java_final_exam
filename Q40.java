//    *
//  * * *
//* * * * *

public class Q40 {
    public static void main(String[] args) {

        int rows = 4;

        for (int row = 1; row <= rows; row++) {

            int bars = rows - row + 1;

            // // | قبل النجوم
            for (int i = 1; i <= bars; i++) {
                System.out.print("  ");
            }

            // النجوم
            for (int i = 1; i <= (2 * row - 1); i++) {
                System.out.print("* ");
            }

            // // | بعد النجوم
            // for (int i = 1; i <= bars; i++) {
            // System.out.print("||");
            // }

            System.out.println((2 * row - 1));
        }
    }

}
