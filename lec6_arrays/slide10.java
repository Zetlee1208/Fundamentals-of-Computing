package lec6_arrays;

import java.util.Scanner;

public class slide10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Nhập số ngày//
        System.out.print("How many days' temperatures? ");
        int days = sc.nextInt();
//khai báo biến số ngày //
        int[] temps = new int[days];
//khai báo giá trị tồng//
        int sum = 0;
//Nhập nhiệt độ từng ngày khớp với số ngày khai báo ở biến trên dòng 10//
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
//tính nhiệt độ trung bình giá trị số thực bằng phép average//
        double average = (double) sum / days;
//khai báo giá trị cao nhất 1,2//
        int max1 = temps[0];
        int max2 = temps[0];
//khai báo giá trị thấp nhất 1,2//
        int min1 = temps[0];
        int min2 = temps[0];
//khai báo ngày cao nhất,lạnh nhất//
        int dayMax1 = 0;
        int dayMax2 = 0;
        int dayMin1 = 0;
        int dayMin2 = 0;

        for (int i = 1; i < days; i++) {

            if (temps[i] > max1) {
                max2 = max1;
                dayMax2 = dayMax1;

                max1 = temps[i];
                dayMax1 = i;
            } else if (temps[i] > max2) {
                max2 = temps[i];
                dayMax2 = i;
            }

            if (temps[i] < min1) {
                min2 = min1;
                dayMin2 = dayMin1;

                min1 = temps[i];
                dayMin1 = i;
            } else if (temps[i] < min2) {
                min2 = temps[i];
                dayMin2 = i;
            }
        }

        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }

        System.out.println("Average temp = " + average);
        System.out.println(count + " days were above average.");

        System.out.println("Two Hottest days: Day " + (dayMax1 + 1) + " (" + max1 + "), Day "
                + (dayMax2 + 1) + " (" + max2 + ")");

        System.out.println("Two coldest days: Day " + (dayMin1 + 1) + " (" + min1 + "), Day "
                + (dayMin2 + 1) + " (" + min2 + ")");

    }
}
