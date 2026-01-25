/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Assignment_6 {
     public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        int even = 0, odd = 0;

        for (int i = 0; i < 15; i++) {
            list.add(rd.nextInt(50) + 1);
        }

        for (int num : list) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(list);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
