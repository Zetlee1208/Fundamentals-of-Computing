package Lec11_Encapsulation.Encapsulation;

public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
