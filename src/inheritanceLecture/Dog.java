package inheritanceLecture;

public class Dog extends Animal {

    private String breed;

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + this.getSpecies() + '\'' +
                ", age='" + this.getAge() + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    //unique method
    public void  fetchBall(){
        System.out.println("fetching ball");
    }

//    public Dog(String species, int age){
//        super(species, age);
//    }

    public Dog(String species, int age, String breed){
        super(species, age);
        this.breed = breed;
    }

    //methods for being inherited in dog and cat class
    public void makeNoise() {
        System.out.println("Bark! Woof! Holla!");
    }

    public void makeGenericAnimalNoise(){
        super.makeNoise();
    }

    //GETTER AND SETTER
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



}
