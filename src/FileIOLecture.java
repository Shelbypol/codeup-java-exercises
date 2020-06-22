import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) {
        //needs to be static if in class
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get(".gitignore");

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));

//        String directory = "test";
//        Path myTest = Paths.get(directory);
        Path newFile = Paths.get("src", "hello.txt");

        //create directory
        if (Files.notExists(newFile)) {
            try {
                Files.createFile(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //create file
//        if (Files.notExists(newFile)) {
//            try {
//                Files.createDirectory(newFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //w
        // riting to new hello.txt file
//        String[] name = {"justin", "sophie", "vivian"};
//        List<String> instructors = Arrays.asList(name);
//        List<String> students = new ArrayList<>();
//        students.add("Laura");
//        students.add("Andrew");
//        students.add("Mark");
//        try {
//            Files.write(newFile, students);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Path groceriesPath = Paths.get("data", "groceries.txt");
        try {
            List<String> myStudents = Files.readAllLines(newFile);
            System.out.println(myStudents);
//        for (int i = 0; i < myStudents.size(); i += 1) {
//            System.out.println((i + 1) + ": " + myStudents.get(i));
//        }
            for (String x : myStudents) {
                System.out.println("*   " + x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //APPEND
        String newStudent = "ramon";
        List<String> newStudents = Arrays.asList("Ramon", "justin", "shelby");
        try {
            Files.write(newFile, newStudents, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //REPLACING
//        List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
        List<String> newList = new ArrayList<>();

        for (String student : newStudents) {
            if (student.equals("Ramon")) {
                newList.add("not shelby");
                continue;
            }
            try {
                Files.write(newFile, newList);
            } catch (IOException e) {
                e.printStackTrace();
            }
            newList.add(student);
        }

//        Files.write(Paths.get("data", "groceries.txt"), newList);


    }
}
