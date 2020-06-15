package inheritanceLecture.Vehicle;

public class VehicleTest {


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Jet j = new Jet();

        v.setIsOperable(true);
        v.setPassengerCapacity(6);
        v.setPowerSource("gas");

        c.setIsOperable(false);
        c.setPassengerCapacity(4);
        c.setPowerSource("diesal");

        j.setIsOperable(true);
        j.setPassengerCapacity(2);
        j.setPowerSource("magic");

        System.out.println("=========");
        System.out.println(v.toString());
        System.out.println("=========");
        System.out.println(c.toString());
        System.out.println("=========");
        System.out.println(j.toString());
        System.out.println("=========");
    }
}
