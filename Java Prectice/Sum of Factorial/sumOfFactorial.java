
import java.util.*;

public class sumOfFactorial {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int fact = 1;
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
            sum = sum + fact;
        }
        System.out.println(fact);
        System.out.print(sum);
}
}