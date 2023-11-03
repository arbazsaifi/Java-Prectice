import java.util.*;

class A {

    public int a = 20;
    private int x = 5;
    int y = 7;
    protected int z = 10;

    void meth1(){
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class B extends A {
    void meth2() {
        System.out.println(a);
        System.out.println(y);
        System.out.println(z);
    }
}

public class accessMethod-specifier {
    public static void main (String args[]) {
        A obj = new A();
        B obj2 = new B();

        obj.meth1();
        System.out.println();
        obj2.meth2();
    }
}