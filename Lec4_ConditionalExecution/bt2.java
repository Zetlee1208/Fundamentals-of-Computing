package Lec4_ConditionalExecution;

import java.util.Scanner;

public class bt2 {

    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap So A : ");
        int percentA = scanner.nextInt();
        System.out.print("Nhap So B : ");
        int percentB = scanner.nextInt();
        if (percentA > percentB) {
            System.out.println("A > B");
        } else {
            System.out.println("B > A");
        }
    }
}
