import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String sure = "Sure";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";

        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob:  0_0\n" +
                           "              -|-\n" +
                           "              / \\\n" +
                           "Talk to Bob:");
        System.out.println("(...If you'd ever like to end your talk with Bob type: 'bye')");
        String userInput = sc.next();

        if (userInput.endsWith("?")) {
            System.out.print(sure);
        } else if (userInput.endsWith("!")) {
            System.out.print(chillOut);
        } else if (userInput.equalsIgnoreCase("")) {
            System.out.print(fine);
        }else if(userInput.equalsIgnoreCase("bye")){
            System.out.print("Bye!");
            System.exit(1);
        }else{
            System.out.print("Whatever...");
        }



    }
}
