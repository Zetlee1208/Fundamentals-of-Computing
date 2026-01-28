//Đếm số từ trong chuỗi//
package bt_String;

import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
