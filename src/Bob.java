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
                System.out.println("^_^\n" +
                                   "-|-\n" +
                                   "/ \\\n");
            } else if (userInput.endsWith("!")) {
                System.out.println(chillOut);
                System.out.println("0_0\n" +
                                   "~|~\n" +
                                   "/ \\\n");
            } else if (userInput.equals("")) {
                System.out.println(fine);
                System.out.println("0_o\n" +
                                   "<|>\n" +
                                   "/ \\\n");
            }else if(userInput.equals("bye")){
                System.out.println(bye);
                System.out.println("0_0\n" +
                                   "<|-'\n" +
                                   "/ \\\n");
            } else {
                System.out.println(whatever);
                System.out.println("-_-\n" +
                                   "<|>\n" +
                                   "/ \\\n");
            }
        } while(!userInput.equals("bye"));

    }
}
