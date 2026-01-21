package lec5_loops;

import java.util.Scanner;
import java.util.Random;

public class bt3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nhap so thuc tu 1 den 100: ");
        double nhap = sc.nextDouble();
        double ngaunhien = rand.nextDouble() * (100.0 - 1.0) + 1.0;

        System.out.println("So ngau nhien: " + ngaunhien);

        if (nhap > ngaunhien) {
            System.out.println("So ban nhap lon hon so ngau nhien");
        } else if (nhap < ngaunhien) {
            System.out.println("So ban nhap nho hon so ngau nhien");
        } else {
            System.out.println("Hai so bang nhau");
        }
    }
}
