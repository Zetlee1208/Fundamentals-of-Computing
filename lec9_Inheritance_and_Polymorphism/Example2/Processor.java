package lec9_Inheritance_and_Polymorphism.Example2;

class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat's ID: " + cat.catID);
        cat.catchMouse();
    }
}
