import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String sure = "Sure";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever...";
        String bye = "Bye!";

        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob:  0_0\n" +
                "              -|-\n" +
                "              / \\\n" +
                "Talk to Bob:");
        System.out.println("(...If you'd ever like to end your talk with Bob type: 'bye')");
        String userInput;

        do {
            userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println(sure);
            } else if (userInput.endsWith("!")) {
                System.out.println(chillOut);
            } else if (userInput.equals("")) {
                System.out.println(fine);
            }else if(userInput.equals("bye")){
                System.out.print(bye);
            } else {
                System.out.println(whatever);
            }
        } while(!userInput.equals("bye"));

    }
}
