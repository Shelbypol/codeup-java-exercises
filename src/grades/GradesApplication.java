package grades;

import util.Input;

import java.util.Map;
import java.util.HashMap;

public class GradesApplication {

    //grades
//    HashMap<String, Integer> map
//            = new HashMap<>();

//    public static int avgStudentGrade(HashMap map) {
//        for (Student value :  ) {
//            int gradeAvg = value.getGradeAverage();
//        }
//        return gradeAvg;
//    }

    //MAIN METHOD
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        //STUDENT 1
        Student s1 = new Student("Andrea");
        s1.addGrade(92);
        s1.addGrade(76);
        s1.addGrade(80);
        s1.recordAttendance("2020-10-02", "P");
        s1.recordAttendance("2020-10-03", "A");
        s1.recordAttendance("2020-10-04", "P");
        s1.recordAttendance("2020-10-05", "P");
        s1.recordAttendance("2020-10-06", "A");
        s1.recordAttendance("2020-10-07", "A");
        s1.recordAttendance("2020-10-08", "P");
        s1.recordAttendance("2020-10-09", "P");
        s1.recordAttendance("2020-10-10", "P");
        s1.recordAttendance("2020-10-11", "P");


        //STUDENT 2
        Student s2 = new Student("Elizabeth");
        s2.addGrade(86);
        s2.addGrade(96);
        s2.addGrade(70);
        s2.recordAttendance("2020-10-02", "A");
        s2.recordAttendance("2020-10-03", "P");
        s2.recordAttendance("2020-10-04", "P");
        s2.recordAttendance("2020-10-05", "P");
        s2.recordAttendance("2020-10-06", "P");
        s2.recordAttendance("2020-10-07", "P");
        s2.recordAttendance("2020-10-08", "P");
        s2.recordAttendance("2020-10-09", "A");
        s2.recordAttendance("2020-10-10", "P");
        s2.recordAttendance("2020-10-11", "P");

        //STUDENT 3
        Student s3 = new Student("Summer");
        s3.addGrade(87);
        s3.addGrade(76);
        s3.addGrade(74);
        s3.recordAttendance("2020-10-02", "A");
        s3.recordAttendance("2020-10-03", "P");
        s3.recordAttendance("2020-10-04", "A");
        s3.recordAttendance("2020-10-05", "P");
        s3.recordAttendance("2020-10-06", "P");
        s3.recordAttendance("2020-10-07", "P");
        s3.recordAttendance("2020-10-08", "P");
        s3.recordAttendance("2020-10-09", "P");
        s3.recordAttendance("2020-10-10", "A");
        s3.recordAttendance("2020-10-11", "P");

        //STUDENT 4
        Student s4 = new Student("Grace");
        s4.addGrade(100);
        s4.addGrade(86);
        s4.addGrade(94);
        s4.recordAttendance("2020-10-02", "P");
        s4.recordAttendance("2020-10-03", "P");
        s4.recordAttendance("2020-10-04", "P");
        s4.recordAttendance("2020-10-05", "P");
        s4.recordAttendance("2020-10-06", "P");
        s4.recordAttendance("2020-10-07", "P");
        s4.recordAttendance("2020-10-08", "P");
        s4.recordAttendance("2020-10-09", "A");
        s4.recordAttendance("2020-10-10", "P");
        s4.recordAttendance("2020-10-11", "P");

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
            System.out.println("\n= Type which student would you like to see more information about?");
            System.out.println("= Type 'avg' to see the average of all students.");
            System.out.println("= Type 'all' to see report of all students.");
            String userInput = input.getString();

            //SEARCH FOR IND STUDENT
            if (students.containsKey(userInput)) {
                System.out.println("\nName: " + students.get(userInput).getName() +
                        "\nGitHub Username: " + userInput +
                        "\nCurrent Average: " + students.get(userInput).getGradeAverage() +
                        "\nInd. grades: " + students.get(userInput).getGrades() +
                        "\nAvg. Attendance: " + students.get(userInput).avgAttendance() );

                //SEARCH GRADE AVG
            } else if (userInput.equalsIgnoreCase("avg")) {
                int count = 0;
                for (Student value : students.values()) {
                    int grades = value.getGradeAverage();
                    count += grades;
                }
                System.out.println("Class Avg: " + count / students.size());

                //CVS REPORT
            } else if (userInput.equalsIgnoreCase("all")) {
                System.out.println("------------------------------------");
                System.out.println("| name | github_username | average |");
                System.out.println("------------------------------------");
                for (Map.Entry<String, Student> e : students.entrySet()) {
                    System.out.printf("|%s%-2s|%-2s%s%-2s|%-2s%d\n", students.get(e.getKey()).getName(), "", "", e.getKey(), "", "", e.getValue().getGradeAverage());
                }
                //SAD PATH
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s", userInput);
            }
            //DO-WHILE CONDITIONAL
            System.out.println("\nWould you like to see another student? [y/N]");
            confirmContinue = input.yesNo();
        } while (confirmContinue);
    }
}


