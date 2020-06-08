import java.util.Scanner;

public class MethodsExercises {

    //addition
    public static int addition(int a, int b) {
        return (a + b);
    }

    //subtraction
    public static int subtraction(int a, int b) {
        return (a - b);
    }

    //multiplication
    public static int multiplication(int a, int b) {
        return (a * b);
    }

    //division
    public static int division(int a, int b) {
        return (a / b);
    }

    //modulus
    public static int modulus(int a, int b) {
        return (a % b);
    }

    //bonus
//    public static int multiply(int x, int y) {
//        if (x == 0 || y == 0) {
//            return 0;
//        } else if (y > 0) {
//            System.out.println("x " + x);
//            System.out.println("y " + y);
//
//            int count = x + multiply(x, y - 1);
//
//            System.out.println("count " + count);
//
//            return count;
//        }
//        return multiply(x, y);
//    }

    //(2) Validate user input;
    public static void getInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int min =  Integer.parseInt(sc.nextLine());
        int max =  Integer.parseInt(sc.nextLine());

        if (( ((min > 0) && (min < 10)) && ((max > 0) && (max <= 10))  )){
            System.out.println("Congrats, your input is within range!");

        }else {
            System.out.println("Try Again:");
            getInteger();

        }
    }


    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 2));
//        System.out.println(multiplication(3, 2));
//        System.out.println(division(6, 2));
//        System.out.println(modulus(20, 2));
//        System.out.println("times for loop " + times(2, 3));
//        System.out.println("answer "+ multiply(4,10));
        getInteger();



    }
}
