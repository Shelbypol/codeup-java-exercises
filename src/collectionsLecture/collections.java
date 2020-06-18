package collectionsLecture;

//imports everything

import java.util.*;

public class collections {
    public static void main(String[] args) {

        //creating arraylist
        //takes in <type> of objects

        //list more generic than assiges
        //ArrayList is specific list which assigns instances to a more generic type (List)
        List<Integer> rand = new ArrayList<>();
        List<Integer> threeNumbers = Arrays.asList(5, 6, 7);
        List<Integer> numbers = new ArrayList<>(threeNumbers);

        ArrayList<String> instructors = new ArrayList<>();

        //Adding elements to Instructors Array List
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        instructors.add(0, "David");
        System.out.println(instructors.size());

        System.out.println(instructors);

        //Adding
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(3));
        System.out.println(numbers.lastIndexOf(4)); //5

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("bob", "ross"));
        people.add(new Person("Shelby", "Polasek"));
        people.add(0, new Person("John", "Smith"));
        System.out.println(people.get(1));
        //iterate over the array list to each ind
        for(Person x : people){
            System.out.println(x.getFirstName());
        }

        System.out.println(instructors.contains("justin")); //false case sensitive
        System.out.println(instructors.contains("Justin")); //true
        System.out.println(instructors.isEmpty()); //false

        System.out.println(rand.isEmpty()); //true


        //Removing element
        instructors.remove("David");
        instructors.remove((0));
        instructors.remove("Sophie");
        System.out.println(instructors);

    }
}
