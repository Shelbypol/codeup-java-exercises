package Vehicle;

public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    //Constructor
//    public Vehicle() {
//
//    }

    public void turnOn(){
        System.out.println("Vehicle is turning on...");
    }

    public Vehicle(boolean operable, int capacity, String power) {
        this.isOperable = operable;
        this.passengerCapacity = capacity;
        this.powerSource = power;
    }

    //toString override
    @Override
    public String toString() {
        return "Vehicle{" +
                "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }

    //Getters & Setters
    public boolean getIsOperable() {
        return this.isOperable;
    }

    public void setIsOperable(boolean x) {
        this.isOperable = x;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public void setPassengerCapacity(int i) {
        this.passengerCapacity = i;
    }

    public String getPowerSource() {
        return this.powerSource;
    }

    public void setPowerSource(String p) {
        this.powerSource = p;
    }


}
