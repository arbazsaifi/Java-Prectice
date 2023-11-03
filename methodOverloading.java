import java.util.*;

//when a class containg more then one method with 
//same name and different perameters is called methodOverloading.

public class methodOverloading {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        methodOverloading obj = new methodOverloading();
        int a = 10;
        int b = 20;
        int c = 30;

        obj.sum(a,b);
        obj.sum(a,b,c);

    }

    static void sum(int a, int b) {  
        int c = a + b ;
        System.out.println(c);
    }

    static void sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }


}