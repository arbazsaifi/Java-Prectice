import java.util.*;

class ClassHello {
    void hello() {
        System.out.print("Hello 1");
    }
}

class SubHello extends ClassHello {
    @overriding
    void hello() {
        System.out.print("Hello 2");
    }    
}

public class Main {
    public static void main (String args[]) {
        
        ClassHello objHello = new SubHello();

        objHello.hello();

    }
}