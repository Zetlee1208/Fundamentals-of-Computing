package lec6_arrays;

public class slide8_2 {

    public static void main(String[] args) {

        int[] numbers = new int[8];

        for (int i = 0; i < 8; i++) {
            numbers[i] = 2 * i;
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
