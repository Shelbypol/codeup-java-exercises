package inheritanceLecture;



public class Cat extends Animal{

    private int noOfLivesLeft;

    public Cat(String species, int age, int noOfLivesLeft){
        super(species, age);
        this.noOfLivesLeft = noOfLivesLeft;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "species='" + this.getSpecies() + '\'' +
                ", age='" + this.getAge() + '\'' +
                ", # of lives left='" + noOfLivesLeft + '\'' +
                '}';
    }

    //GETTER & SETTER
    public int getNoOfLivesLeft() {
        return noOfLivesLeft;
    }
    public void setNoOfLivesLeft(int noOfLivesLeft) {
        this.noOfLivesLeft = noOfLivesLeft;
    }

    //methods for being inherited in dog and cat class
    @Override
    public void makeNoise() {
        System.out.println("Meow..mew..mew");
    }

    public static void main(String[] args) {



    }

}
