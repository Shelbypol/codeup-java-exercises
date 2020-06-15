package inheritanceLecture;

public class Animal {

    protected String species;
    protected int age;

    //Empty Constructor for inheritance
    public Animal() {

    }

    //constructor Animal Class
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    //methods for being inherited in dog and cat class
    public void makeNoise() {
        System.out.println("This animal is making some noise...");
    }

    //GETTERS AND SETTERS
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public String printSummary() {
//        return "Species: " + this.species + "\nAge: " + this.age;
//    }

//    public String toString(){
//        return "Species: " + this.species + "\nAge: " + this.age;
//    }

//Control enter
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Animal a = new Animal("Primate", 7);


    }
}
