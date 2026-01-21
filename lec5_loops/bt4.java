package lec5_loops;

import java.util.Random;
import java.util.Scanner;

public class bt4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int ngaunhien = rand.nextInt(10) + 1;
        int nhapso = 0;
        int count = 0;

        while (nhapso != ngaunhien) {
            System.out.print("Nhap so nguyen tu 1 den 10: ");
            nhapso = sc.nextInt();
            count++;
        }

        System.out.println("Ban da doan dung sau " + count + " lan");
    }
}
