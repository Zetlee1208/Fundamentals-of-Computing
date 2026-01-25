package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Assignment_10 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("An");
        names.add("Binh");
        names.add("An");
        names.add("Cuong");
        names.add("Binh");

        HashSet<String> set = new HashSet<>(names);

        ArrayList<String> noDuplicate = new ArrayList<>(set);

        System.out.println(noDuplicate);
    }
}
