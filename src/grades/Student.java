package grades;
import java.util.ArrayList;

public class Student {

    //PRIVATE PROPERTIES
    private String name;
    private ArrayList<Integer> grades;

    //CONSTRUCTOR
    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    //METHODS
    public void addGrade(int grade){
        grades.add(grade);
    }

    public int getGradeAverage() {
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    //MAIN METHOD
    public static void main(String[] args) {

        Student s1 = new Student("k");
        s1.addGrade(88);
        System.out.println(s1.getGradeAverage());
        s1.addGrade(92);
        System.out.println(s1.getGradeAverage());
    }

    //GETTERS & SETTERS
    //get/set name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //get/set array
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}
