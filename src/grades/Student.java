package grades;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();




    //GETTERS & SETTERS

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
