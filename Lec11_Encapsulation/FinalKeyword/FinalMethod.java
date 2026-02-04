package Lec11_Encapsulation.FinalKeyword;
// final method → kế thừa được, nhưng không override//

class Parent {

    final void display() {
        System.out.println("This is final method");
    }
}

/* display() đã là final method
        KHÓA hành vi lại
        Class con bắt buộc dùng y nguyên, không được sửa */
class Child extends Parent {
    // void display() { } // 

}
