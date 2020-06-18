package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {

    //MAIN METHOD
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        //STUDENT 1
        Student s1 = new Student("Andrea");
        s1.addGrade(92);
        s1.addGrade(76);
        s1.addGrade(80);

        //STUDENT 2
        Student s2 = new Student("Elizabeth");
        s2.addGrade(86);
        s2.addGrade(96);
        s2.addGrade(70);

        //STUDENT 3
        Student s3 = new Student("Summer");
        s3.addGrade(87);
        s3.addGrade(76);
        s3.addGrade(74);

        //STUDENT 4
        Student s4 = new Student("Laura");
        s4.addGrade(100);
        s4.addGrade(86);
        s4.addGrade(94);

        students.put("watermelondrea", s1);
        students.put("lizzyMc", s2);
        students.put("gitsome", s3);
        students.put("chocoBars", s4);

        System.out.println("Welcome");
        System.out.println("------------------------------------------------");
        System.out.println("Here are the GitHub user names of our students:\n");
        for (String key : students.keySet()) {
            System.out.print(" |" + key + "| ");
        }
        System.out.println("\n----------------------------------------------");

        //GET USER INPUT
        Input input = new Input();
        boolean confirmContinue;
        do {
            System.out.println("Which student would you like to see more information about?");
            String userInput = input.getString();
            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput).getName() +
                        " - GitHub Username: " + userInput +
                        "\nCurrent Average: " + students.get(userInput).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s", userInput);
            }
            System.out.println("\nWould you like to see another student? [y/N]");
            confirmContinue = input.yesNo();
        } while (confirmContinue);
    }
}


