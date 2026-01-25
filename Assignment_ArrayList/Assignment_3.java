/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Assignment_3 {
     public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(10.5);
        prices.add(20.0);
        prices.add(15.75);
        prices.add(30.2);

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }
}
