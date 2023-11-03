import java.util.*;
//When Exception Not Occurs
// public class finallyStatements {
//     public static void main (String args[]) {
//         int a = 10;
//         int b = 2;
//         int c ;
        
//         c = a / b ;

//         try {
//             System.out.println(c);
//         }
//         catch(ArithmeticException e) {
//             System.out.println("Exception Occurs : " + e);
//         }
//         finally{
//             System.out.print("This is Finally Block.");
//         }
//     }
// }

// When Exception  Occurs
// Exceptions can be 1. NullPointerException e
//                   2. ArrayIndexOutOfBoundsException e
//                   3. ArithmeticException e
//                   4. IllegalArgumentException e
//                   5. Exception e
public class finallyStatements {
    public static void main (String args[]) {
        int a = 10;
        int b = 0;
        int c ;
        
        c = a / b ;

        try {
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception Occurs : " + e);
        }
        finally{
            System.out.print("This is Finally Block.");
        }
    }
}

