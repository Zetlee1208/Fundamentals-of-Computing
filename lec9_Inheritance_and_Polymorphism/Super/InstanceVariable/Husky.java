package lec9_Inheritance_and_Polymorphism.Super.InstanceVariable;

class Husky extends Dog {

    void displayInformation() {
        super.displayPrice();  // invoke superclass's method
        System.out.println("Husky's price is 1500 USD");
    }
}
