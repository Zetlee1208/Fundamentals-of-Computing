package Lec4_ConditionalExecution;

import java.util.Scanner;

public class bt2_1 {

    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();

        System.out.print("Input b: ");
        int b = scanner.nextInt();

        int max = findMaxNumber(a, b);

        System.out.println("The larger number is: " + max);
    }
}

    

