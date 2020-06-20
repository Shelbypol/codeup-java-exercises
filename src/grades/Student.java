package grades;
import javax.swing.plaf.PanelUI;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import util.Input;

public class Student {

    //PRIVATE PROPERTIES
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance = new HashMap<>();

    //CONSTRUCTOR
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
//        attendance = new HashMap<>();
    }

    //GRADE METHODS
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    //ATTENDANCE METHODS
    public void recordAttendance(String date, String value) {
        if(value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
            attendance.put(date, value);
        }else{
            System.out.println("Please enter 'P' or 'A'");
        }
    }

    //ATTENDANCE AVERAGE
    public double avgAttendance(){
        int countP = 0;
        int countA = 0;
        for(String date : attendance.keySet()){
            if(attendance.get(date).equals("P")){
                countP += 1;
            }else{
                countA += 1;
            }
        }
        return (double)(attendance.size() - countA) / attendance.size() * 100;
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

    public HashMap<String, String> getAttendance() {
        return attendance;
    }
    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }
}
