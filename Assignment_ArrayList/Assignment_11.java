/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Assignment_11 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100) + 1);
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
