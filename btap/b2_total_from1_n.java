package btap;

import java.util.Scanner;

public class b2_total_from1_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tong tu 1 den " + n + " = " + sum);
    }
}
