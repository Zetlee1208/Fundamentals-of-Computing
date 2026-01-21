package lec5_loops;

import java.util.Scanner;
import java.util.Random;

public class bt6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int randomNumber = rd.nextInt(100) + 1; 
        int guess;

        while (true) {
            System.out.print("Nhap so ban doan (1-100): ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Chuc mung!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Lon hon");
            } else {
                System.out.println("Nho hon");
            }
        }
    }
}
