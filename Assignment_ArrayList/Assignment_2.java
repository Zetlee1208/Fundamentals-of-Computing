package Assignment_ArrayList;

import java.util.ArrayList;

public class Assignment_2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");

        colors.set(1, "Yellow"); // thay phần tử thứ 2

        System.out.println(colors);
    }
}
