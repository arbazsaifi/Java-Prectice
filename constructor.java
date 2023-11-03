import java.util.*;
//Constructor and class have same name

//1. Main Purpose of Constructor is Initialize the Object.
//2. Every Java class has a Constructor.
//3. A Constructor is automatically called at the time of object creation.
//4. A Constructor never contain any return type including void.

public class constructor {
    public static void main (String args[]) {
        A obj = new A ();

        obj.show();
    }
 }

 class A {
    int a ;
    String b;

    A() {     //this is constructor
        a = 5;
        b = null;
    }

    void show() {
        System.out.print(a + " " + b);
    }
 }