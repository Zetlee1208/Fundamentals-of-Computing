package Lec11_Encapsulation.StaticKeyword;

public class Counter {

    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}
