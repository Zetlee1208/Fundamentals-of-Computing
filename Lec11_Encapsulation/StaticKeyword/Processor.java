package Lec11_Encapsulation.StaticKeyword;

public class Processor {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Student.changeSchool();
        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");

        s1.display();
        s2.display();
    }
}
