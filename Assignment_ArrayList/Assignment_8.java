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
public class Assignment_8 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");

        ArrayList<String> copyList = new ArrayList<>(fruits);

        System.out.println("Original: " + fruits);
        System.out.println("Copy: " + copyList);
    }
}
