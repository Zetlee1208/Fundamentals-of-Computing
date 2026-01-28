// Đếm số ký tự trong chuỗi//
package bt_String;

import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();

        System.out.println("Number of characters: " + length);
    }
}
