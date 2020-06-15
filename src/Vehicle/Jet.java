package Vehicle;


public class Jet extends Vehicle {

    private int maximumAltitude;

    //CONSTRUCTOR
    public Jet(boolean operable, int capacity, String power, int maximumAltitude) {
        super(operable, capacity, power);
        this.maximumAltitude = maximumAltitude;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                "} " + super.toString();
    }

    //METHODS
    public void takeOff(){
        System.out.println("Taking off...");
    }

    public void turnOn(){
        System.out.println("Igniting jet engines");
    }

    //GETTERS & SETTERS
    public int getMaximumAlitude() {
        return maximumAltitude;
    }
    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;



    }
}
