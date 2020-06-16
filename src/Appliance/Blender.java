package Appliance;

public class Blender extends Appliance {

    public Blender(String brand, String color){
        super();
    }

    public void makeSound(){
        System.out.println("Making sound: VrRrRrRrRrrrrrrrrRRRRrRrRrRrrrr");
    }

    public void doWork(){
        System.out.println("Working: spinning...grinding....slicing...MORE SPINNING!");
    }
}
