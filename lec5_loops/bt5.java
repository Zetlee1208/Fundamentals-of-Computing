package lec5_loops;

import java.util.Scanner;
import java.util.Random;

public class bt5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int randomNumber = rd.nextInt(10) + 1; 
        int count = 0;
        int userNumber;

        do {
            System.out.print("Nhap so tu 1 den 10: ");
            userNumber = sc.nextInt();
            count++;
        } while (userNumber != randomNumber);

        System.out.println("Ban da doan dung!");
        System.out.println("So lan nhap: " + count);
    }
}
