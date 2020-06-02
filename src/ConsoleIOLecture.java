
import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {

//++++++++++        Controll R .... shortcut to compile

//        System.out.println("Hello Ganymede!");

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");


        // ================================== printf()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");

        // creating a string variable:
//            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello %S", bigBall); // all caps

//++++++++++        %n new line
//++++++++++        %s string
//++++++++++       %d number..decimal integer (not for actual decimal numbers.. int
//++++++++++      %f floating point number and double ... for decimals
//++++++++++       %.2f will print out to two decimal places

        // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

        // currency:
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);

//      write a program that will print your name with a greeting
        //welcome, Your name!
//        String name = "Shelby";
//        System.out.printf("Welcome %s!", name);

//++++++++++    souf ...shortcut for printf

        // ================================== USER INPUT

        Scanner sc = new Scanner(System.in);

//++++++++++ shortcut for import : option enter
//++++++++++ command b to see info about what is highlighted


//        String userInput = scanner.next
//            String userInput = sc.next();
//        System.out.println(userInput);
//        System.out.println("You entered the following:" + userInput); //
//        type hello World returns: You entered the following: Hello

//        String userInputs = sc.nextLine(); //multiple words
//        System.out.println("you entered"  + userInput); // Yo


        // .next() captures each input separated by whitespace:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);


        // .nextLine():

//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);


        // unexpected behaviour

        //

//            String word1 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//            String line1 = sc.nextLine();
//            String word2 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//            String line2 = sc.nextLine();

//            System.out.printf("%s%n%s%n%s%n%s%n", word1, line1, word2, line2);

        // check for presence of various data types

//            int userInt = 0;
//            if (sc.hasNextInt()) {
//                userInt = sc.nextInt();
//                System.out.printf("The user entered %d. This number times two is %d.", userInt, userInt * 2);
//            } else {
//                System.out.println("The user did not enter an integer");
//            }


    }

}