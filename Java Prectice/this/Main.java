import java.util.*;

//this refers to instance variable
class A {
    int a;
    int b;

    A() {
        this.a = 200;
        System.out.print(this.a);
        
        this.b = 100;
        System.out.println(this.b);
    }
    A(int a, int b) {
        this.a = a;
        System.out.print(this.b);
    
        this.b = b;
        System.out.print(this.b);
    }
}

public class Main {
    public static void main (String args[]) {
        
        A obj = new A();
        A obj2 = new A(25, 30);
    
    }
}