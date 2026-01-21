package lec5_loops;

import java.util.Random;

public class bt1 {

    public static void main(String[] args) {

        Random rand = new Random();

        int number = 0;

        while (number == 0) {
            number = rand.nextInt(100) + 1;
            System.out.println(number);
        }

    }
}
