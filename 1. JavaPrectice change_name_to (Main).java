// ----------------------- Simple Input and Output -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String[] args) {

//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Any Number : ");
//         n = sc.nextInt();

//         int sq = n * n ;

//         System.out.print("Square is = " +sq);
//     }
// }

// ----------------------- Switch -----------------------------------
// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// int button;
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter Button Number : ");
// button = sc.nextInt();

// switch (button) {
// case 1:
// System.out.print("Hello");
// break;

// case 2:
// System.out.print("Namaste");
// break;

// case 3:
// System.out.print("Bonjour");
// break;

// default:
// System.out.print("Wrong Inpur");
// }
// }
// }

// ----------------------- Loops -----------------------------------------
// ----------------------- 1) For Loop -----------------------------------

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// for (int i = 0; i <= 100; i++) {
// System.out.println(i + " Hello");
// }
// }
// }

// ----------------------- 2) While Loop -----------------------------------
// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = 1;

// while (a <= 10) {
// System.out.println(a);
// a++;
// }

// }
// }

// ----------------------- 3) Do While Loop -----------------------------------

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = 1;

// do {
// System.out.println(a);
// a++;

// } while (a <= 10);

// }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Star Pattern (Rectangle) With User Input (Single Number) -----------------------------------
// ----------------------- 1. -----------------------------------
// *****
// *****
// *****
// *****

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i, j, n;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (i = 1; i <= n; i++) {
//             for (j = 1; j <= n; j++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }

//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Star Pattern (Rectangle or Square)With User Input (Rows and Colums ) -----------------------------------
// ----------------------- 2. -----------------------------------
// *****
// *****
// *****
// *****

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int r, c, i, j;

//         System.out.print("Enter Number of Rows : ");
//         r = sc.nextInt();
//         System.out.print("Enter Number of Colums : ");
//         c = sc.nextInt();

//         for (i = 1; i <= r; i++) {
//             for (j = 1; j <= c; j++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }

//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Print Stars Pattern (Half Pyramid) with User Input Rows -----------------------------------
// ----------------------- 3. -----------------------------------
// *
// * *
// * * *
// * * * * 
// * * * * *
// * * * * * *

// import java.util.*;

// public class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         int i, j, n;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();
        
//         for (i = 1; i <= n; i++) {
//             for (j = 1; j <= i; j++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Star Pattern (Hollow Rectangle) with User Input (Rows and Colums) -----------------------------------
// ----------------------- 4. -----------------------------------
// *****
// *   *
// *   *
// *****

// import java.util.*;

// public class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         int i, j, r, c;

//         System.out.print("Enter Rows : ");
//         r = sc.nextInt();
//         System.out.print("Enter Colums : ");
//         c = sc.nextInt();

//         for (i = 1; i <= r; i++) {
//             for (j = 1; j <= c; j++) {
//                 if( i == 1 || j == 1 || i == r || j == c ) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Star Pattern (Inverted Pyramid) -----------------------------------
// ----------------------- 5. -----------------------------------
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// import java.util.*;

// public class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         int i, j, n;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();
        
//         for (i = n; i >= 1; i--) {
//             for (j = 1; j <= i; j++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Star Pattern (Half Pyramid Rotated 180°) -----------------------------------
// ----------------------- 6. -----------------------------------
//          *
//         ** 
//        *** 
//       **** 
//      ***** 
//     ****** 

// import java.util.*;

// public class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         int n;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1 ; j <= n-i; j ++) {
//                 System.out.print(" ");
//                 }
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }    
//                 System.out.println();
//             }
//         }
//     }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Number Pattern (Half Left Pyramid) -----------------------------------
// ----------------------- 7. -----------------------------------
// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int r = 4 , c = 5 ;

//         for (int i = 1 ; i <= r ; i++) {
//             for (int j = 1 ; j <= i ; j ++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Number Pattern (Half Pyramid Rotated 180°) -----------------------------------
// ----------------------- 8. -----------------------------------
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int r=5, c=5;

//         for (int i = 1; i <= r ; i++) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Inverted Half Pyramid with Numbers -----------------------------------
// ----------------------- 9. -----------------------------------

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int r=5, c=5;

//         for (int i = r ; i >= 1 ; i--) {
//             for (int j = 1; j <= i ; j ++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Inverted Half Pyramid with Numbers -----------------------------------
// ----------------------- 10. -----------------------------------

// 5 5 5 5 5
// 4 4 4 4
// 3 3 3 
// 2 2
// 1

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int r=5 , c=5;

//         for (int i = r ; i >= 1 ; i--) {
//             for (int j = 1 ; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- Floyd's Triangle with Numbers -----------------------------------
// ----------------------- 11. -----------------------------------

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n , number = 1 ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= i ; j ++) {
//                 System.out.print(number + " ");
//                 number ++;
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------- Patterns with Nasted for Loop -----------------------------------
// ----------------------- 0-1 Triangle -----------------------------------
// ----------------------- 12. -----------------------------------

// 1
// 0 1 
// 1 0 1 
// 0 1 0 1
// 1 0 1 0 

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 5 ;

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= i ; j++) {
//                 if ((i+j)%2 == 0) {
//                     System.out.print("1" + " ");
//                 }
//                 else {
//                     System.out.print("0" + " ");
//                 }
//             }
//         System.out.println();
//         }
//     }
// }

// ----------------------- For Loop -----------------------------------
// ----------------------- Print ALL Even Numbers till n -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }

//     }
// }

// ----------------------- Loop -----------------------------------
// ----------------------- Print the Sum of 1 to n -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n;
//         int sum = 0;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n ; i++) {
//             sum = sum+i;
//         }

//         System.out.print(sum);
//     }
// }


// ----------------------- For Loop -----------------------------------
// ----------------------- Print the Sum of n! Factorial -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
        
//         int n;
//         int sum = 0 , fact = 1 ;

//         System.out.print("Enter Number for Factorial Sum : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             fact = fact * i ;
//             sum = sum + fact ;
//         }
//         System.out.print(sum);
//     }
// }

// ----------------------- For Loop -----------------------------------
// ----------------------- Factorial Calculator -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;
//         int fact = 1 ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1 ; i <= n ; i++) {
//             fact = fact * i ;
//         }

//         System.out.print(fact);

//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Butterfly Pattern -----------------------------------
// ----------------------- 13. -----------------------------------

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             * 

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 4 ;

//         for (int i = 1; i <= n ; i++) {
//             for (int j = 1 ; j <= i; j++) {
//                 System.out.print("*");
//             }

//             int space = 2 * (n-i);

//             for (int j = 1; j <= space ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print("*");
//             }

//             int space = 2 * (n-i);

//             for (int j = 1; j <= space ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Butterfly Pattern (With User Input) -----------------------------------
// ----------------------- 14. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*" + " ");
//             }

//             int space = 2 * (n-i);
//             for (int j = 1 ; j <= space ; j++) {
//                 System.out.print(" " + " ");
//             }

//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*" + " ");
//             }

//             System.out.println();
//         }

//         for (int i = n ; i >= 1 ; i--) {
//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*" + " ");
//             }

//             int space = 2 * (n-i);
//             for (int j = 1 ; j <= space ; j++) {
//                 System.out.print(" " + " ");
//             }

//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print("*" + " ");
//             }

//             System.out.println();
//         }       
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Solid Rohmbus -----------------------------------
// ----------------------- 15. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 5 ;

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1 ; j <= n ; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Hollow Rohmbus -----------------------------------
// ----------------------- 15. -----------------------------------

// ****    *****
// ***    *****
// **    *****
// *    *****

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 5 ;

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print("*");
//             }

//             for (int j = 1 ; j <= n ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = n ; j >= 1 ; j--) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Number Pyramid -----------------------------------
// ----------------------- 16. -----------------------------------

//      1
//     2 2
//    3 3 3
//   4 4 4 4 
//  5 5 5 5 5

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 5 ;

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i ; j++) {
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Number Pyramid (With User Input) -----------------------------------
// ----------------------- 17. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n ; i++) {
//             for (int j = 1; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i ; j ++) {
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Palindromic Pattern -----------------------------------
// ----------------------- 18. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n = 5 ;

//         for (int i = 1 ; i <= n ; i++) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             for (int j = 2 ; j <= i ; j++) {
//                 System.out.print(j);    
//             }

//             System.out.println();
//     }
// }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Palindromic Pattern (With User Input) -----------------------------------
// ----------------------- 19. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1 ; j <= n-i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = i ; j >= 1 ; j--) {
//                 System.out.print(j);
//             }

//             for (int j = 1 ; j <= i ; j++) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }

// ----------------------- Advanced Patterns with Nasted for Loop -----------------------------------
// ----------------------- Diamond Pattern -----------------------------------
// ----------------------- 20. -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in); //Scanner Input

//         int n = 5 ;

//         // Upper Half
//          //Printing Space
//         for (int i = 1; i <= n ; i++) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             //Printing Stars (*)
//             for (int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
            
//             //Printing Line
//             System.out.println();
//         }
//         //Lower Half
//         //Printing Space
//         for (int i = n; i >= 1 ; i--) {
//             for (int j = 1 ; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }

//             //Printing Stars
//             for (int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
            
//             //Printing Line
//             System.out.println();
//         }
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Printing Name (With Function) -----------------------------------

// import java.util.*;

// public class Main {

//     public static void printMyName(String name) {
//         System.out.print("Your Name is " + name);
//         return ;
//     }

//     public static void main (String args[]) {
//             Scanner sc = new Scanner (System.in);

//             System.out.print("Enter Your Name : ");
//             String name = sc.next();

//             printMyName(name);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Calculating 3 Number Sum (With Function With User Input) -----------------------------------

// import java.util.*;

// public class Main {

//     public static void sumCalc(int a, int b, int c) {
//         int sum = a + b + c ;

//         System.out.print("The Sum is " +sum);

//         return ;
//     }



//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Number a : ");
//         int x = sc.nextInt();

//         System.out.print("Enter Number b : ");
//         int y = sc.nextInt();

//         System.out.print("Enter Number c : ");
//         int z = sc.nextInt();

//         sumCalc(x, y, z);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Calculating 2 Numbers and Return sum -----------------------------------

// import java.util.*;

// public class Main {
//     public static int calcSum (int a, int b) {
//         int sum = a + b ;

//         return sum ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Number a : ");
//         int x = sc.nextInt();

//         System.out.print("Enter Number b : ");
//         int y = sc.nextInt();

//         int sum = calcSum(x, y);

//         System.out.print("The Sum is " +sum);
// }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Calculating Square of a Number -----------------------------------

// import java.util.*;

// public class Main {

//     public static int findSquare(int a) {
//         int square = a * a ;

//         return square;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int x ;

//         System.out.print("Enter Number : ");
//         x = sc.nextInt();

//         System.out.print("Square is " + findSquare(x));

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Factorial of 2 Numbers -----------------------------------

// import java.util.*;

// public class Main {

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int x ;

//         System.out.print("Enter Number : ");
//         x = sc.nextInt();

//         int fact = calcFactorial(x);

//         System.out.print("Factorial of a Number is : " + fact);

//     }

//     public static int calcFactorial(int a) {

//         if (a < 0) {
//             System.out.println("Invalid Number");
//             return 0;
//         }

//         int fact = 1;

//         for (int i = 1; i <= a; i++) {
//             fact = fact * i ;
//         }

//         return fact;
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Finding Even Numbers -----------------------------------

// import java.util.*;

// public class Main {

//     public static void findEven(int a) {
//         for (int i = 1; i <= a ; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//         return ;
//     }


//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         findEven(n);
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Print Table of Number n -----------------------------------

// import java.util.*;

// public class Main {

//     public static void table(int a) {
        
//         for (int i = 1 ; i <= 10 ; i++) {
//             int tab = i * a ;
//             System.out.println(a + "X" + i + "=" + tab);
//         }
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n, tab ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         table(n);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Factoral Calculator with Void Function -----------------------------------

// import java.util.*;

// public class Main {
//     public static void fact(int a) {

//         int fact = 1;

//         if(a < 0) {
//             System.out.println("Invalid Input");
//             return ;
//         }

//         for (int i = a; i >= 1 ; i--) {
//             fact = fact * i ;
//         }
//         System.out.print(fact);

//         return ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//        fact(n);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Printing ODD Numbers (User Input) -----------------------------------

// import java.util.*;

// public class Main {
//     public static void primeNumberCheck(int n) {

//         int check ;

//         for (int i = 1 ; i <= n ; i++) {
//             if (i % 2 == 0) {
//                 continue;
//             }
//             else {
//                 System.out.println(i);
//             }
//         }

//         return ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//             int n ;

//             System.out.print("Enter Number : ");
//             n = sc.nextInt();

//             primeNumberCheck(n);

//         }
//     }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Checking Number is Prime or Not -----------------------------------

// import java.util.*;

// public class Main {

//     public static void findPrime(int n) {
//         int count = 0 ;

//         if (n == 1) {
//             System.out.print("Its Not a Prime Number Nor a Composite Number.");
//             return ;
//         }

//         for (int i = 1 ; i <= n ; i++) {
//             if(n % i == 0) {
//                 count++ ;
//             }
//         }

//         if (count == 2) {
//             System.out.println("Its Prime Number.");
//         }
//         else {
//             System.out.println("Not a Prime Number.");
//         }

//     }


//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();


//         findPrime(n);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Entering 3 Number and Return Average -----------------------------------

// import java.util.*;

// public class Main {

//     public static float averageCalc(float a, float b, float c) {
//         float avg ;

//         avg = ( a + b + c ) / 3 ;

//         return avg ;
//     }


//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         float x, y, z ;

//         System.out.print("Enter Number a : ");
//         x = sc.nextFloat();

//         System.out.print("Enter Number b : ");
//         y = sc.nextFloat();

//         System.out.print("Enter Number c : ");
//         z = sc.nextFloat();

//         float average = averageCalc(x, y, z);

//         System.out.println("The Average of a, b, c is " + average);

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Calculate ODD Number till n and Return Sum -----------------------------------

// import java.util.*;

// public class Main {

//     public static int oddNumberSum(int n) {
        
//         int odd = 0 ;

//         for (int i = 1 ; i <= n ; i++) {
//             if (i % 2 == 0) {
//                 continue;
//             }
//             else {
//                 odd = odd + i ;
//             }
//         }
//         return odd ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;

//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         int sum ;
        
//         sum =  oddNumberSum(n) ;

//         System.out.println("Sum : " + sum );
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ------- function which takes in 2 numbers and returns the greater of those two -----------------------------

// import java.util.*;

// public class Main {
    
//     public static int greaterNumber(int a , int b ) {
//         if (a > b) {
//             return a ;
//         }
        
//         return b;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int m, n, greater ;

//         System.out.print("Enter Number a : ");
//         m = sc.nextInt();

//         System.out.print("Enter Number b : ");
//         n = sc.nextInt();
        
//         if (m == n ) {
//             System.out.print("Both are Equal");
//         }

//         else {

//         greater = greaterNumber(m, n);

//         System.out.print("The Greatest Number is : " + greater);

//         }

        

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// -------------  function that takes in the radius as input and returns the circumference of a circle. ----------------

// import java.util.*;

// public class Main {

//     public static double circumOfCircle(double r) {

//     return 2 * 3.14 * r ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         double n ;

//         System.out.print("Enter Circumference of Circle : ");
//         n = sc.nextFloat();

//         double circum ;

//         circum = circumOfCircle(n) ;

//         System.out.print("The Circumference of Circle is : " + circum);
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ------ function that takes in age as input and returns if that person is eligible to vote or not. A person of age >= 18 is eligible to vote ----

// import java.util.*;

// public class Main {

//     public static void isElligible(int age) {

//         if(age >= 18) {
//             System.out.print("You Can Vote");
//         }
//         else {
//             System.out.print("Can't Vote");
//         }
//         return ;
//     }

//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Age : ");
//        int age = sc.nextInt();
       
//         isElligible(age);

//     }   

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Infinite Loop using do while condition -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {

//         // int a = 1;

//         do {
//             System.out.print("Hello World");
//             // a++;
//         } while(true);
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- program to enter the numbers till the user wants and at the end ---------------------------------
// ------------------------ it should display the count of positive, negative and zeros entered -----------------------------------


// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n, number ;
//         int positive = 0 , nagative = 0 , zeros = 0 ;

//         System.out.print("Press 1 to continue or 0 to Exit : ");
//         n = sc.nextInt();
// if (n == 1) {
//         while(n == 1) {
//             System.out.print("Enter Number : ");
//             number = sc.nextInt();

//             if (number < 0) {
//                 nagative++ ;
//             }
//             else if (number == 0) {
//                 zeros++;
//             }
//             else {
//                 positive++;
//             }

//             System.out.print("Press 1 to continue or 0 to Exit : ");
//             n = sc.nextInt();
//         }
//     }
//         System.out.println();
//         System.out.println("Positive Numbers : " + positive);
//         System.out.println("Nagative Numbers : " + nagative);
//         System.out.println("Zeros : " + zeros);
        
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Two numbers are entered by the user, x and n. Write a function to find ----------------------------
// ----------------------- the value of one number raised to the power of another i.e. 𝑥^n . -----------------------------------

// import java.util.*;

// public class Main {

//     public static int returnNumberCount(int x, int n) {

//         int result = 1 ;

//         for (int i = 1; i <= n; i++) {
//             result = result * x ;
//         }
//         return result ;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int x = 1 , n = 1 ;

//         System.out.print("Enter Number x : ");
//         x = sc.nextInt();

//         System.out.print("Enter Power of x : ");
//         n = sc.nextInt();

//         int number = returnNumberCount(x, n);

//         System.out.println("The x^n is : " + number);

//     }
// }


// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- a function that calculates the Greatest Common Divisor of 2 numbers. -----------

// import java.util.*;

// public class Main {

//     public static int commonDivisor(int a, int b) {
    
//         while(a != b){
//         if (a > b) {
//             a = a - b ;
//         }
//         else {
//             b = b - a ;
//         }
//     }
//         return b;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int a, b, number ;
        
//         System.out.print("Enter First Number : ");
//         a = sc.nextInt();

//         System.out.print("Enter Second Number : ");
//         b = sc.nextInt();

//         number = commonDivisor(a, b);

//         System.out.print("The Greatest Commond Division of " +a +" and " +b +" is : " +number +".");

//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Write a program to print Fibonacci series of n terms where n is input by user ---------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;
//         System.out.print("Enter Number : ");
//         n = sc.nextInt();

//         if (n > 1) {
//             int a = 0 , b = 1 ;

//             System.out.print(a + " ");
//             System.out.print(b + " ");

//             for (int i = 3; i <= n; i++) {

//                 int c = 0 ;
//                 c = a + b ; 

//                 System.out.print(c + " ");
                
//                 a = b ;
//                 b = c ;             


//             }
//         }
//         else {
//             System.out.print("Input must be Greater then 1.");
//         }
//     }
// }

// ----------------------- Functions (in Java) -----------------------------------
// ----------------------- Write a Function to print Fibonacci series of n terms where n is input by user -----------------------------------

// import java.util.*;

// public class Main {
//     public static void fibonacciSeries(int n) {

//     int a = 0;
//     int b = 1;
//     int c = 0;

//     if (n > 1) {
//         System.out.print(a + " ");
//         System.out.print(b + " ");

//         for (int i = 3 ; i <= n ; i++) {
//             c = a + b;
//             System.out.print(c + " ") ;

//             a = b ;
//             b = c ;
//         }        
//     }
//     return ;
// }    

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int n ;
        
//         System.out.print("Enter Number : ") ;
//         n = sc.nextInt();

//         fibonacciSeries(n);
        
//     }
// }

// ----------------------- Arrays -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int[] subject = new int[3];

//         subject [0] = 78 ;
//         subject [1] = 87 ;
//         subject [2] = 65 ;

//         // Simple Printing Array
//         System.out.println(subject[0]);
//         System.out.println(subject[1]);
//         System.out.println(subject[2]);

//         System.out.println();

//         // Printing Array Through Loop
//         for (int i = 0 ; i < 3 ; i++) {  
//             System.out.println(subject[i]);
//         }
//     }
// }

// ----------------------- Arrays -----------------------------------
// ----------------------- Simple Diclaring an Array -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int subject[] = new int[3];
//         //int[] subject = new int[3];   //It is Also a Valid Syntax
//         //int subjects[] = {78, 87, 65} ;  //It is Also a Valid Syntax

//         subject [0] = 78 ;
//         subject [1] = 87 ;
//         subject [2] = 65 ;

//         // Simple Printing Array
//         System.out.println(subject[0]);
//         System.out.println(subject[1]);
//         System.out.println(subject[2]);

//         System.out.println();

//         // Printing Array Through Loop
//         for (int i = 0 ; i < 3 ; i++) {  
//             System.out.println(subject[i]);
//         }


//     }
// }

// ----------------------- Arrays -----------------------------------
// ----------------------- Input and Output an Array -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Number Size of an Array : ");
//         int size = sc.nextInt();

//         int marks[] = new int[size];

//         //input
//         for (int i = 0 ; i < size ; i++) {
//             System.out.print("Enter Marks : ");
//             marks[i] = sc.nextInt();
//         }

//         //printing a line
//         System.out.println();

//         //output
//         for (int i = 1 ; i < size ; i++)  {
//             System.out.println(marks[i]) ;
//         }
//     }
// }

// ----------------------- Arrays -----------------------------------
// ----------------------- Q. Take an Arraya as input from the user. Search for a given -----------------------------------
// ----------------------- number 'x' and print the index at which it occurs -----------------------------------
// ----------------------- It also Known as Linear Search -----------------------------------
// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Array Length : ");
//         int size = sc.nextInt();

//         int number[] = new int[size];

//         for (int i = 0 ; i < size ; i++) {
//             System.out.print("Enter Number : ");
//             number[i] = sc.nextInt();
//         }

//         System.out.print("Enter x for Search : ");
//         int x = sc.nextInt();

//         for (int i = 0 ; i < size ; i++) {
//             if (number[i] == x) {
//                 System.out.println("The Number x is lies on : " + i );
//             }
//             else {
//                 System.out.println("The Number x = " + x + " is Not Exist in this Array.");
//                 break ;
//             }       
//         }
//     }
// }

// ----------------------- Arrays -----------------------------------
// ----------------------- Finding Maximum Element of an Array -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         int arr[] = {58, 73, 77, 99, 88};

//         int max = arr[0];

//         for (int i = 1; i < arr.length ; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


// ----------------------- Arrays -----------------------------------
// ----------------------- Initializing String and Integer with in Array -----------------------------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);


//         String str[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nineth", "tenth"};

//         System.out.print("Enter Array Size : ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for (int i = 0 ; i < size ; i++) {
//             System.out.print("Enter Number : ");
//             arr[i] = sc.nextInt();            
//         }

//         for (int i = 0 ; i < size ; i++) {
//             System.out.println("The "+ str[i] + " Number is : "+ arr[i]);
//         }

//         } 
//     }

// ----------------------- Arrays -----------------------------------
// ----------------------- 2D Arrays -----------------------------------
// ----------------------- Input Matrix Elements and Print a Matrix (With Input No. of Rows and Colums) ----------------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Number of Rows : ");
//         int rows = sc.nextInt();

//         System.out.print("Enter Number of Colums : ");
//         int cols = sc.nextInt();

//         int matrix[][] = new int[rows][cols];

//         //Input
//         //Rows and Colums
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0 ; j < cols ; j++) {
//                 System.out.print("Enter Number : ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         //Simple Line        
//         System.out.println();
        
//         //Output
//         for (int i = 0 ; i < rows ; i++) {
//             for (int j = 0; j < cols ; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.print("This is a " +rows + "X" + cols + " Matrix.");
//     }
// }

// ----------------------- Arrays -----------------------------------
// ----------------------- Input a Matrix Elements and Find 'x' Number in Matrix and Print its Position ----------

// import java.util.*;

// public class Main {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter Number of Rows : ");
//         int rows = sc.nextInt();
//         System.out.print("Enter Number of Colums : ");
//         int cols = sc.nextInt();

//         System.out.println();

//         int matrix[][] = new int[rows][cols];

//         for (int i = 0 ; i < rows ; i++) {
//             for (int j = 0 ; j < cols ; j++) {
//                 System.out.print("Enter Number : ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println();
        
//         System.out.println("The Matrix is : ");
        
        // for (int i = 0 ; i < rows ; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.print("Enter Number to Find in Matrix : ");
        // int x = sc.nextInt();
        
        // System.out.println();

        // for (int i = 0 ; i < rows ; i++) {
//             for (int j = 0 ; j < cols ; j++) {
//                 if (matrix[i][j] == x) {
//                     System.out.print("The Number is Found on ("+ i + "," + j + ").");
//                 }
//             }
//         }
//     }
// }

// ----------------------- String -----------------------------------
// ----------------------- Simple Printing String -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {

//         String name = "Arbaz Khan";

//         System.out.print(name);
                
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- Input and Output of String (With User Input) -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 Scanner sc = new Scanner (System.in);

//                 System.out.print("Enter Your Name : ");
//                 String name = sc.nextLine();

//                 System.out.print("Your Name is "+ name);
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- Printing String (With '.charAt' Method) -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
 
//                 String firstName = "ARBAZ";
//                 String lastName = "KHAN";

//                 String fullName = firstName + lastName ;
                
//                 for (int i = 0 ; i < fullName.length() ; i++) {           
//                         System.out.println(fullName.charAt(i));
//                 }
//         }
// }

// ----------------------- String -----------------------------------
// ----------------- Extracting a Substring with a String (with '.substring(bignning Index, Ending Index)' Method) ---

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 Scanner sc = new Scanner (System.in);

//                 //crate a string
//                 String sentance = "Hello, This is Shahrukh Khan" ;
//                 //we calculating the charctors of string in bignning index and ending index.
//                 String name = sentance.substring(15,sentance.length()); //we calculating the charctors of string.

//                 //print
//                 System.out.print(name);
                
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Simple String Print -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
                
//                 StringBuilder sb = new StringBuilder("HELLO");
                
//                 System.out.print(sb);

                
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Print a Charactor (.charAt) -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 Scanner sc = new Scanner (System.in);

//                 StringBuilder str = new StringBuilder("Hello My Name is AK");

//                 System.out.print(str.charAt(17));
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Print a Charactor from String (.charAt) -----------------------------------
// ----------------------- .charAt(index_number) -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 Scanner sc = new Scanner (System.in);

//                 StringBuilder str = new StringBuilder("Hello My Name is AK");

//                 System.out.print(str.charAt(17));
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Change a Charctor from String (with '.setCharAt' Method) and Print String -----------------------------------
// ----------------------- .setCharAt(index_number , 'charactor') -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
                
//                 StringBuilder strbuild = new StringBuilder ("Hello");


//                 strbuild.setCharAt(0,'C'); //.setCharAt is for Change a Charactor in string

//                 System.out.print(strbuild);
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Insert a Charctor from String (with '.insert' Method) and Print String -----------------------------------
// ----------------------- .insert(index_Number , 'charactor') -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 StringBuilder str = new StringBuilder("Hello");

//                 str.insert(0,'H');  //.insert is for insert a charactor in string

//                 System.out.print(str);
//         }
// }


// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Delete a Charctor from String (with '.delete' Method) and Print String -----------------------------------
// --------------------------- .delete(starting_index_number, ending_index_number) -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 StringBuilder str = new StringBuilder ("Hello");

//                 str.delete(0,4); //end_index will be Excluded

//                 System.out.print(str);
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Prectice of '.delete' and '.insert' method -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 StringBuilder str = new StringBuilder ("Hello World! ");

//                 str.delete(6,11);   //deleting Charactors

//                 str.insert(6,'A');  //inserting Charactors
//                 str.insert(7,'r');
//                 str.insert(8,'b');
//                 str.insert(9,'a');
//                 str.insert(10,'z');

//                 System.out.print(str);

//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Insert a Charactor from String (with '.append' Method) and Print String ---- append means insert at last -----------------------------------
// --------------------------- .append('charactor' or "String") -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 StringBuilder str = new StringBuilder ("H");

//                 str.append('e'); //append means insert at last ('charactor' or "string")
//                 str.append('l');
//                 str.append('l');
//                 str.append("ooooooo");

//                 System.out.print(str);
//         }
// }

// ----------------------- String -----------------------------------
// ----------------------- String Builder -----------------------------------
// ----------------------- Reverse of a String using StringBuilder ---------------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 Scanner sc = new Scanner (System.in);

//                 System.out.print("Enter String : ");
//                 StringBuilder str = new StringBuilder(sc.nextLine());

//                 for (int i = (str.length())-1; i >= 0; i--) {
//                         System.out.print(str.charAt(i));
//                 }                

//         }
// }

// ----------------------- Bit Manipulation -----------------------------------
// ----------------------- Get Bit -----------------------------------
// ----------------------- Getting Bit is 0 or 1 -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
        
//                 int n = 5; 
//                 int pos = 3;
//                 int bitMani = 1<<pos;
                
//                 if ((n & bitMani) == 0) {
//                         System.out.println("Its Zero");
//                         System.out.print(1<<pos);
//                 }
//                 else {
//                         System.out.println("Its One");
//                         System.out.print(1<<pos);
//                 }

//         }
// }

// ----------------------- Bit Manipulation -----------------------------------
// ----------------------- Set Bit -----------------------------------
// ----------------------- Setting bit to 1 -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
                
//                 int n = 5 ;
//                 int pos = 1 ;
//                 int bitMani = 1<<pos ;

//                 int newNumber = n | bitMani ;

//                 System.out.print(newNumber);


//         }
// }

// ----------------------- Bit Manipulation -----------------------------------
// ----------------------- Clear Bit -----------------------------------
// ----------------------- Making a Bit to 0 -----------------------------------

// import java.util.*;

// public class Main {
//         public static void main (String args[]) {
//                 int n = 5 ;
//                 int pos = 2 ;
//                 int bitMani = 1<<pos ;
//                 bitMani = ~(bitMani);

//                 int newNumber = n & bitMani ;

//                 System.out.print(newNumber);
//         }
// }

// ----------------------- Bit Manipulation -----------------------------------
// ----------------------- Update Bit -----------------------------------
// ----------------------- Making 0 to 1 and 1 to 0 -----------------------------------
// ----------------------- 0 to 1 (Perform Clear bit Operation which is "&AND with ~Not") -----------------------------------
// ----------------------- 1 to 0 (Perform Set bit Operation which is "|OR") -----------------------------------

import java.util.*;

public class Main {
        public static void main (String args[]) {
                Scanner sc = new Scanner (System.in);
                int n = 5 ;
                int pos = 1 ;
                int bitMani = 1<<pos ;

                System.out.print("Enter Value is 0 or 1 : ");
                int opr = sc.nextInt();

                if (opr == 1) {
                        //clear
                        int newBitMani = ~(bitMani);
                        int newNumber2 = n & newBitMani ;
                        System.out.print(newNumber2);
                }
                else {
                        int newNumber = n | bitMani ;
                        System.out.print(newNumber);
                }
        }
}