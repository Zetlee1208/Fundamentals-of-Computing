package Lec4_ConditionalExecution;

import java.util.Scanner;

public class slide33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("please enter 1<=N<=5");
        }
    }

}
