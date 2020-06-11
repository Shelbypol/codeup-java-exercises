package util;

public class InputTest {

    public static void main(String[] args) {

        Input input1 = new Input();

        System.out.println("Would you like to continue?");
        boolean yesNo = input1.yesNo();
        System.out.printf("You choose: %b\n", yesNo);

        System.out.println("Please enter a whole number.");
        int getInt = input1.getInt();
        System.out.printf("You entered: %d\n", getInt);

        System.out.println("Please enter a number between 20 and 35.");
        int getIntRange = input1.getInt(20, 35);
        System.out.printf("You entered: %d\n", getIntRange);

        System.out.println("Please enter a number with decimal places.");
        double getDouble = input1.getDouble();
        System.out.printf("You entered: %.2f\n", getDouble);

        System.out.println("Please enter a number between 0 and 1.");
        double getDoubleRange = input1.getDouble(0, 1);
        System.out.printf("You entered: %.2f\n", getDoubleRange);

        System.out.println("Thank you for your participation!");

    }
}
