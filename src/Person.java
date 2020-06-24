public class Person {
    private String name;

    //getter 1st (get the private name) encapsulation
    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    //setter (reassigns or (transforms) the getter) encapsulation
    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name.toUpperCase();
    }

    //method
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!\n", this.name);
    }

    //constructor
    public Person(String name) {
        this.name = name;
//        this.setName(name);
    }


    public static void main(String[] args) {
        Person p1 = new Person("Shelby");
        System.out.println(p1.getName());
        p1.sayHello();




        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
