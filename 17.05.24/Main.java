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

/*--------------------------------- Polymorphism -----------------------------------*/
/*-------------------------------- 2. Method Overriding ----------------------------------*/
// class Animal {
//     void makeSound() {
//         System.out.println("Animal makes sound.");
//     }
// }

// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("The dog barks");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Animal myDog = new Dog();
        
//         myDog.makeSound();
//     }
// }

/*--------------------------------------------------------------------------------*/ 
/*-------------------------------- Constructor -----------------------------------*/
/*** Constructor having saming name as class ***/
// class Main {
//     public static void main (String args[]) {
//         // object of anotherClass class
//         anotherClass cons = new anotherClass(10, 2);

//         cons.sum();
//     }
// }

// class anotherClass {

//     int a, b;

//     // Constructor of Another class
//     anotherClass(int a, int b) { 
//         this.a = a;
//         this.b = b;
//     }

//     void sum() {
//         System.out.println(a+b);
//     }
// }

/*----------------------------------------------------------------------------------------*/
/*-------------------------------- Constructor Overloading ----------------------------------*/
/*** class having multiple constructor with different number of parameters ***/
// class Main {
//     public static void main(String[] args) {
//         person per1 = new person();
//         person per2 = new person("Arbaz");
//         person per3 = new person("Amir", 22);
//         person per4 = new person("Raju", 24, "New Delhi");

//         per1.personDetail();
//         per2.personDetail();
//         per3.personDetail();
//         per4.personDetail();
//     }
// }

// class person {
//     String name;
//     int age;
//     String city;

//     person() {
//         this.name = "unknown";
//         this.age = 0;
//         this.city = "unknown";
//     }

//     person(String name) {
//         this.name = name;
//         this.age = 0;
//         this.city = "unknown";
//     }

//     person(String name, int age) {
//         this.name = name;
//         this.age = age;
//         this.city = "unknown";
//     }

//     person(String name, int age, String city) {
//         this.name = name;
//         this.age = age;
//         this.city = city;
//     }

//     void personDetail() {
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//         System.out.println("City: " + this.city);
//         System.out.println("");
//     }

// }

