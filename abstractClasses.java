import java.util.*;

// Abstracted means : "Existing in Thought OR as an Idea without concrete existance".
// Abstract Method : A method that  is declared without an implementation.
// Abstract Class : If a Clas includes abstract methods, then the class itselt 
//                  must be declared abstract.

abstract class A  {  //Abstract class
    A() {  //This is Constructor
        System.out.println("Hello, I am hello of abstract class.");   
    }

    abstract void greet();  //Abstract method
    
}

class B extends A {   //Overrided Class from A
    @Override
    void greet() {   //Overrided method of class A (greet)
        System.out.println("Hello, I am greet of Class B.");
    }
}

class C extends A {   //extra override for prectice XD
    @Override
    void greet() {
        System.out.println("Hello, I am gree of Class C.");
    }
}

public class abstractClasses {  //main Class
    public static void main (String args[]) { //Main Method
        B obj = new B();  //Class B object Create
        obj.greet();  //Calling method through Object

        C obj2 = new C();
        obj.greet();

    }
}