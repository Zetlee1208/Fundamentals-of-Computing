package lec5_loops;

import java.util.Random;

public class bt2 {

    public static void main(String[] args) {
        Random rand = new Random();
        double number = rand.nextDouble() * (8.0 - 1.8) + 1.8;
        System.out.println(number);
    }
}
