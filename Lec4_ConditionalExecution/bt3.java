package Lec4_ConditionalExecution;

import java.util.Scanner;

public class bt3 {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = kb.nextDouble();

        System.out.print("Input y: ");
        double y = kb.nextDouble();

        System.out.println("Quadrant = " + quadrant(x, y));
    }
}
