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
public class Assignment_12 {
     public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(100) + 1;
            list.add(num);
            sum += num;
        }

        System.out.println(list);
        System.out.println("Sum = " + sum);
    }
}
