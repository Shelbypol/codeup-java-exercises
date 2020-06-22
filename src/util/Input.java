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

    //METHODS
    public int getInt() {
        try {
            return Integer.valueOf(getString());
            //Integer.parseInt(getString)
        } catch (NumberFormatException e) {
            System.out.println("not a num");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Please enter an integer in the correct range between " + min + " " + "and " + max);
            return getInt(min, max);
        }
    }

        public double getDouble () {
            try{
                return Double.valueOf(getString());
            } catch(NumberFormatException e) {
                System.out.println("Invalid input need a num");
                System.out.println(e.getMessage());
                return getDouble();
            }
        }

        public double getDouble(double min, double max){
            double userInput = getDouble();
            if (userInput > max || userInput < min) {
                System.out.println("Try Again:");
                return getDouble(min, max);
            }
            return userInput;
        }
}








//    public double getDouble () {
//        if (sc.hasNextDouble()) {
//            return sc.nextInt();
//        } else {
//            System.out.println("Invalid input need a decimal num");
//            sc.next();
//            return getDouble();
//        }
//    }
