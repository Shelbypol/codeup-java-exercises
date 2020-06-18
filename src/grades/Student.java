package grades;
import java.util.ArrayList;

public class Student {

    //PRIVATE PROPERTIES
    private String name;
    private ArrayList<Integer> grades;

    //CONSTRUCTOR
    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    //METHODS
    public void addGrade(int grade){
        grades.add(grade);
    }

    public Integer getGradeAverage() {
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    //MAIN METHOD
    public static void main(String[] args) {

        Student s1 = new Student("Bob" , 1.2);



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
