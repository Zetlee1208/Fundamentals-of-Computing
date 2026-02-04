package Lec11_Encapsulation.StaticKeyword;

public class Student {

    int id;
    String name;
    static String school = "DTU";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void changeSchool() {
        school = "FPT";
    }

    void display() {
        System.out.println(id + " " + name + " " + school);
    }
}
