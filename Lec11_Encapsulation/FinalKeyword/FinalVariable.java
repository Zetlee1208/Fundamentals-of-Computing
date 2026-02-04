package Lec11_Encapsulation.FinalKeyword;

public class FinalVariable {

    final int MAX = 100; // khóa giá trị nên không đổi được giá trị( hằng số ) //

    void display() {
        System.out.println(MAX);
        // MAX = 200; lỗi vì chỉ gán 1 lần duy nhất //
    }
}

