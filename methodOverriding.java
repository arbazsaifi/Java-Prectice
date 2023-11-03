import java.util.*;


// whenever we writing a method in super and sub classes in such a way that
// method name and parameter must be same is called method overriding.

// SuperClass का Method use ना होकर SubClass का Method use होता है 
// उस Method की जगह।

class A {
    void hello() {
        System.out.print("Hello 1");
    }
}

class B extends A {
    @Override
    void hello() {
        System.out.print("Hello 2");
    }
}

public class methodOverriding {
    public static void main (String args[]) {
        A obj = new B();

        obj.hello();
    }
}