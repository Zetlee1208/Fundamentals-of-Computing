package btap;

import java.util.Scanner;
import java.util.Arrays;

public class assg5 {

    public static void hienThi(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void daoNguoc(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    public static void hienThiSoChan(int[] a) {
        for (int x : a) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static int tongChiaHet3Va5(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x % 3 == 0 && x % 5 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    public static void sapXepGiam(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nMang vua nhap:");
        hienThi(a);

        daoNguoc(a);
        System.out.println("Mang sau khi dao nguoc:");
        hienThi(a);

        System.out.println("Cac so chan:");
        hienThiSoChan(a);

        int tong = tongChiaHet3Va5(a);
        System.out.println("Tong cac so chia het cho 3 va 5 = " + tong);

        sapXepTang(a);
        System.out.println("Mang tang dan:");
        hienThi(a);

        sapXepGiam(a);
        System.out.println("Mang giam dan:");
        hienThi(a);
    }
}
