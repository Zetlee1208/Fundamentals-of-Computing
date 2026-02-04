package lec9_Inheritance_and_Polymorphism.MethedOverloading;

public class Processor {

    public static void main(String[] args) {
        Animals a1 = new Animals();
        Animals a2 = new Dog();
        Animals a3 = new Cat();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
