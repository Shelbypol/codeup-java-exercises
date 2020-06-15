package inheritanceLecture;

public class AnimalTest {

    public static void makeAnimalsNoise(Animal[] animals) {
        for (Animal a : animals) {
            a.makeNoise();
        }
    }

    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.setAge(3);
//        a.setSpecies("Primate");
//        Dog d = new Dog();
//        d.setAge(5);
//        d.setSpecies("Canine");

//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();

//        System.out.println("=========");
//        System.out.println(a.toString());
//        System.out.println("=========");
//        System.out.println(d.toString());
//        System.out.println("=========");
//        System.out.println(c.toString());

        Dog d = new Dog("canine", 3, "border terrier");
        System.out.println(d.toString());
//        d.makeNoise();
        System.out.println("=========");

        //===========================

        Cat c = new Cat("feline", 5, 8);
        System.out.println(c.toString());
//        c.makeNoise();
        System.out.println("=========");

        //===========================

        Animal a = new Animal("Primate", 100);

        System.out.println(a.toString());

        Animal[] animals = new Animal[2];
        animals[0] = d;
        animals[1] = c;


//        animals[0].fetchBall();
        Dog dog = (Dog) animals[0];
        dog.fetchBall();

        makeAnimalsNoise(animals);


    }
}
