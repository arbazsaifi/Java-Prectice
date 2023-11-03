import java.util.*;

public class J {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
        System.out.println(arr[i]);

        }        
    }

}