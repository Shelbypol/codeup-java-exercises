package Appliance;

public class ApplianceTest {

    public static void main(String[] args) {
        Appliance myFridge = new Refrigerator("Whirlpool", "black");
        Appliance myBlender = new Blender("kent", "red");

        System.out.println(myFridge);
        myFridge.makeSound();
        myFridge.doWork();
        System.out.println("==========");
        System.out.println(myBlender.getBrand());
        System.out.println("Blender");
        myBlender.makeSound();
        myBlender.doWork();
    }
}
