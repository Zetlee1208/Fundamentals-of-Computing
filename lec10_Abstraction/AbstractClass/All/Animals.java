package lec10_Abstraction.AbstractClass.All;

public abstract class Animals {

    private final String name;

    public Animals(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public abstract void makeSound();
}
