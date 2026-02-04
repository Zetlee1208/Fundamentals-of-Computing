package Lec11_Encapsulation.Encapsulation;

public class Processor {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nam");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
