package Lec11_Encapsulation.AccessModifier;

public class AccessModifier2 extends AccessModifier1 {

    @Override
    public void display() {
        // System.out.println(pvt); // lỗi
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
