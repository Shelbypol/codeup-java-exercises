package util;

import java.util.Scanner;

public class Input {
//    Scanner sc = new Scanner(System.in);

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        return getString().startsWith("y");
    }

    //recursion
    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input. Need an number");
            sc.next();
            return getInt();
        }
    }


    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput < max || userInput > min) {
            System.out.println("Try Again:");
            return getInt(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input need a decimal num");
            sc.next();
            return getDouble();
        }
    }

//    public double getDouble(double min, double max) {
//        double userInput = getDouble();
//        if((userInput > max || userInput < min)){
//            return userInput;
//        } else  {
//            System.out.println("Try Again:");
//            return getDouble(min, max);
//        }
//    }


    public double getDouble(double min, double max) {
//        double userInput = getDouble();
        double userInput = sc.nextDouble();
        if (userInput > max || userInput < min) {
            System.out.println("Try Again:");
            return getDouble(min, max);
        }
        return userInput;
    }

}
