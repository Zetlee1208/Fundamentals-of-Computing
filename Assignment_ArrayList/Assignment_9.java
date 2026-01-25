/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Assignment_9 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(5);
        list.add(30);
        list.add(10);
        list.add(25);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
