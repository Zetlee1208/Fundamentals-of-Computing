package Lec8_ObjectAndClass.Constructor.Example2;

public class Student_Sl48 {

    int id;
    String name;
    int age;

    Student_Sl48(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student_Sl48(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
