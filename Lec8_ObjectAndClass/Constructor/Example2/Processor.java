package Lec8_ObjectAndClass.Constructor.Example2;

public class Processor {
    public static void main(String[] args) {
        Student_Sl48 s1 = new Student_Sl48(111, "Karan");
        Student_Sl48 s2 = new Student_Sl48(222, "Aryan", 25);

        s1.display();
        s2.display();
    }
}
