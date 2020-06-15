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

    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.setSpecies("Canine");
//        d.setAge(5);
//        d.setBreed("Border Terrier");
//
//        System.out.println(d.toString());

    }


}
