import java.util.*;

class A {
    int roll;
    String subject;
}

class B extends A {
    roll = 20;
    subject = "CS";

    void display() {
        System.out.print("Your Roll Number is " +roll + " and " + "Subject is " +subject);
    }
}


public class Main {
    public static void main (String args[]) {
        A obj = new B();

        obj.display();
    }
}