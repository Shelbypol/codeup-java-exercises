
//    ================================= OOP NOTES
//    -- UP TO NOW --
//     - mostly programming in an imperative way both in JS and Java.
//     - functions/methods change the state of various variables

//    -- DEFINITION --
//      - OOP - Object-oriented programming
//      - A programming paradigm where state (data/properties) and behavior (functionality/methods)
//    are grouped together (often into objects).
//      - Objects in Java are created from classes (a blueprint for an object/instance)

//    -- ADVANTAGES OF OOP --
//      -Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
//      - implementation details can be abstracted away making code more readable (Abstraction)
//      - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
//      - duplication is minimized through inheritance hierarchies (Inheritance)
//      - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)

//    -- THE FOUR PILLARS OF OOP --
//      1. Abstraction - keep it clean
//      2. Encapsulation - keep it contained
//      3. Inheritance - keep it hierarchical (DRY)
//      4. Polymorphism - keep it versatile

//    --Link to Four Pillars--
//    https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219

//    Today we will focus on Abstraction and Encapsulation.

//    -- CONCEPTS COVERED --
//      - how to create custom classes and objects from these classes
//      - defining and using instance and static fields
//      - how to control class constructors
//      - using the "this" keyword
//      - controlling encapsultation with visibility modifiers


package oopLecture;

import java.util.Scanner;
import java.util.Date;

public class OopLecture {
    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
        Scanner sc = new Scanner(System.in);

        //control enter..quick constructor


        Person person = new Person();
        person.name = "John Smith";
        person.age = 32;

        Post post = new Post();
        post.category = "funny";
        post.title = "A Day";
        post.content = "The content of the course is hard. Super hard. Really hard.";
        post.createdAt = new Date();
        post.editedAt = new Date();
        post.author = person;

        System.out.println(post.author.age);





//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        rick.age += 1;
//        System.out.println(rick.firstName); //default null
//        System.out.println(rick.lastName); //default null
//        System.out.println(rick.age);   //default 0
////        System.out.println(rick.character); //default square char
////        System.out.println(rick.isEmployed); //default is false
//
//        Person fred = new Person();
//        fred.firstName = "Fred";
//        fred.lastName = "Smith";
//        System.out.println(fred.firstName);
//        System.out.println(fred.lastName);


// Instance and Object words interchangable

        // -- Dog Example --

//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";


        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//        Dog d1 = new Dog();
//        d1.age = 3;
//        d1.breed = "corgi";
//        d1.canBreed = false;
//        d1.name = "Tater";
//        System.out.println(d1.animalType);
//
//        d1.callForDog("Tater");


        // ======================== slide 5 (class fields)
//
//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --
//        System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);
//        System.out.println(DogHelper.humanToDogYears(5));
        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);


        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.printx(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }

//    public static class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName;


}
//}
