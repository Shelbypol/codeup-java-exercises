public class Person {
    private String name;

    //getter
    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    //setter
    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    //method
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, \n%s!", getName());
    }

    //constructor
    public Person() {
        sayHello();
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Shelby";
        setName("p1.name");




    }


}
