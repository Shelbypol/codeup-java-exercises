package Vehicle;


public class Car extends Vehicle {

    private int milesPerGallon;

    //CONSTRUCTOR
    public Car(boolean operable, int capacity, String power, int milesPerGallon) {
        super(operable, capacity, power);
        this.milesPerGallon = milesPerGallon;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                "} " + super.toString();
    }

    //METHODS
    public void deployAirBag(){
        System.out.println("Deploying airbag...");
    }

    public void turnOn(){
        System.out.println("Cranking engine...");
    }

    //GETTERS & SETTERS
    public int getMilesPerGallon() {
        return milesPerGallon;
    }
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

}
