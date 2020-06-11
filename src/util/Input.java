package util;

import shapes.Circle;

import java.util.Scanner;

public class Input{
    Scanner sc = new Scanner(System.in);

    private String scanner;

    public String getString() {
        return this.scanner = sc.next();
    }
    public void setString(String s) {
        this.scanner = s;
    }

    public boolean yesNo() {
        return getString().startsWith("y");
    }

    public int getInt(int min, int max) {
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Try Again:");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        return sc.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput = sc.nextDouble();
        if (userInput > max || userInput < min) {
            System.out.println("Try Again:");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        return sc.nextDouble();
    }


}
