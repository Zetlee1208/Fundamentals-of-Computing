package Lec11_Encapsulation.AccessModifier;

public class AccessModifier1 {

    private int pvt = 1;
    int df = 2; // default
    protected int pro = 3;
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
