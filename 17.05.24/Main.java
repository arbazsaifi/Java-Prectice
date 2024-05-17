// OOP (Java)
/*------------------------------------------------------------------------------------*/ 
/*-------------------------------- Class and Object ----------------------------------*/ 

// class Car {
//     String color;
//     String model;

//     void drive() {
//         System.out.println("Model: " + this.model + " and Color: " + this.color);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
        
//         myCar.color = "Red";
//         myCar.model = "G-Wagon";

//         myCar.drive();
//     }
// }


/*-------------------------------------------------------------------------------*/ 
/*-------------------------------- Inheritance ----------------------------------*/
// class Animal {
//     void eat() {
//         System.out.println("Animal eats food");
//     }
// }

// // Inherit class from Animal class
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog is barking");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();

//         myDog.eat();   //method from Animal class
//         myDog.bark();  //method from Dog class
//     }
// }

/*--------------------------------------------------------------------------------*/ 
/*-------------------------------- Polymorphism ----------------------------------*/
/*-------------------------------- 1. Method Overloading ----------------------------------*/
// class Main {
//     public static void main(String[] args) {
//         calcSum(2,3);
//         calcSum(2,3, 3);
//     }

//     // first function
//     static void calcSum(int a, int b) {
//         System.out.println(a + b);
//     }

//     // second function but different number of parameters
//     static void calcSum(int a, int b, int c) {
//         System.out.println(a + b + c);
//     }
// }

