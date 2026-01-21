package lec5_loops;

import java.util.Scanner;

public class slide27 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String phrase;

        do {
            System.out.print("Type your password: ");
            phrase = console.next();
        } while (!phrase.equals("duytan"));

    }
}
