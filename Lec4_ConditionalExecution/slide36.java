package Lec4_ConditionalExecution;

import java.util.Scanner;

public class slide36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap phep tinh(+,-,*,/): ");
        int c;
        String cc = scanner.nextLine();
        switch (cc) {
            case "+" -> {
                c = a+b;
                System.out.println(a + "+" + b + "=" + c);
            }
            case "-" -> {
                c = a-b;
                System.out.println(a + "-" + b + "=" + c);
            }
            case "*" -> {
                c =a+b;
                System.out.println(a + "*" + b + "=" + c);
            }
            case "/" -> {
                c =a/b;System.out.println(a + "/" + b + "=" + c);
            }
            default -> System.out.println("ban nhap khong hop le");

        }
    }
}
