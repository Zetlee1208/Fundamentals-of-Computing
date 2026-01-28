package bt_String;

import java.util.Scanner;

public class bt6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("New word: ");
        String newWord = sc.nextLine();
        String result = str.replace(oldWord, newWord);

        System.out.println("Result: " + result);
    }
}
