package Lec3_Scanner;

import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine();

        System.out.print("Hometown: ");
        String hometown = sc.nextLine();

        System.out.print("GPA: ");
        float gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Major: ");
        String major = sc.nextLine();

        System.out.print("Scholarship: ");
        boolean scholarship = sc.nextBoolean();

        System.out.println("\n===== STUDENT INFORMATION =====");
        System.out.println("Full name : " + hoVaTen);
        System.out.println("Student ID: " + studentID);
        System.out.println("Hometown  : " + hometown);
        System.out.println("GPA       : " + gpa);
        System.out.println("Major     : " + major);
        System.out.println("Scholarship: " + scholarship);

        sc.close();
    }
}
