import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String sure = "Sure";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";

        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob:  0_0\nTalk to Bob...");
        String userInput = sc.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println(sure);
        } else if (userInput.endsWith("!")) {
            System.out.println(chillOut);
        } else if (userInput.equalsIgnoreCase("")) {
            System.out.print(fine);
        }else{
            System.out.println("Whatever");
        }

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

    }
}
