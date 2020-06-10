public class Person {
    private String name;

    //getter
    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    //setter
    public void setName(String newName) {
//TODO: change the name property to the passed value
        this.name = newName;
    }

    //method
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!", getName());
    }

    //constructor
    public Person(String name) {
        this.setName(name);
    }


    public static void main(String[] args) {

        Person p1 = new Person("Shelby");
        p1.sayHello();



    }


}
