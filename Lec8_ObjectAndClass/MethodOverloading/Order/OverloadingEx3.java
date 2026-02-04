package Lec8_ObjectAndClass.MethodOverloading.Order;
// Overload bằng thứ tự tham số //
class OverloadingEx3 {

    static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
