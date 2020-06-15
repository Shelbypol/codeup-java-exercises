package Vehicle;

public class VehicleTest {

    public static void turnOnVehicles(Vehicle[] vehicles){
        for(Vehicle v : vehicles){
            v.turnOn();
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle(true, 6, "gas");
        Car c = new Car(true, 4, "hybrid", 23);
        Jet j = new Jet(true, 2, "magic", 51_000);

        System.out.println(v.toString());
        System.out.println("=========");

        System.out.println(c.toString());
        c.deployAirBag();
        System.out.println("=========");

        System.out.println(j.toString());
        j.takeOff();
        System.out.println("=========");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = c;
        vehicles[1] = j;
        vehicles[2] = v;

        turnOnVehicles(vehicles);

    }
}
