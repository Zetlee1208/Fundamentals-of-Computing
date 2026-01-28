
package bt_String;

import java.util.Scanner;

public class bt7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String numbers = str.replaceAll("[^0-9]", " ");

        numbers = numbers.trim().replaceAll("\\s+", " ");

        System.out.println("Extracted numbers: " + numbers);
    }
}
