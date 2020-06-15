package inheritanceLecture;

public class AnimalTest {

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

        Dog d = new Dog();
        d.setAge(3);
        d.setSpecies("Canine");
        d.setBreed("Border Terrier");

        d.makeNoise();
        d.makeGenericAnimalNoise();
        System.out.println(d.toString());
        //===========================
        Cat c = new Cat();
        c.setAge(11);
        c.setSpecies("Feline");
        c.makeNoise();
        //===========================
        Animal a = new Animal();
        a.setSpecies("Primate");
        a.setAge(100);

        a.makeNoise();



    }
}
