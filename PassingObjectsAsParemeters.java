import java.util.*;

class A {
    int age ;
    String name ;

    A (int age , String name) {
        this.age = age ;
        this.name = name ;
    }

    void display (A a) {
        System.out.println(name + " " + age);
    }
}

class PassingObjectsAsParemeters {
    public static void main (String args[]) {
        A a = new A(55,"Mannu");
        a.display(a);
    }
}