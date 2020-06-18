package grades;

import java.util.HashMap;

public class GradesApplication {

    //MAIN METHOD
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        //STUDENT 1
        Student s1 = new Student("watermelondrea", 88);
        s1.addGrade(76);
        s1.addGrade(80);

        //STUDENT 2
        Student s2 = new Student("lizzyMc", 89);
        s2.addGrade(96);
        s2.addGrade(70);

        //STUDENT 3
        Student s3 = new Student("gitsome", 78);
        s3.addGrade(76);
        s3.addGrade(74);

        //STUDENT 4
        Student s4 = new Student("happyfeet", 58);
        s4.addGrade(86);
        s4.addGrade(34);

        students.put(s1.getName(), s1.getGradeAverage());
        students.put(s2.getName(), s2.getGradeAverage());
        students.put(s3.getName(), s3.getGradeAverage());
        students.put(s4.getName(), s4.getGradeAverage());
        System.out.println(students);
    }

}
