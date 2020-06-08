import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HighLow {

    public static int random() {
        return (int) (Math.random() * 100);
    }

    public static void highLow() {
        int random = random();
        System.out.println("random: " + random);
        System.out.println("Guess a number 1 & 100!");
    }
        public static void game(){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
            if (userInput > random) {
                System.out.println("LOWER");
                game();
            } else if (userInput < random) {
                System.out.println("HIGHER");
                game();
            } else {
                System.out.println("GOOD GUESS!");
                highLow();
            }
        }



    public static void main(String[] args) {
        highLow();
        game();
    }
}
