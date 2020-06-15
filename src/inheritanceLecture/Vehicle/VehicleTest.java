package inheritanceLecture.Vehicle;

public class VehicleTest {


    public static void main(String[] args) {
        //data type vehicle
        Vehicle v = new Vehicle();
        //data type vehicle creating a car instance labled c
        Vehicle c = new Car();
        //data type jet creating a jet instance labled j
        Jet j = new Jet();

        v.setIsOperable(true);
        v.setPassengerCapacity(6);
        v.setPowerSource("gas");

        c.setIsOperable(false);
        c.setPassengerCapacity(4);
        c.setPowerSource("hybrid");

        j.setIsOperable(true);
        j.setPassengerCapacity(2);
        j.setPowerSource("magic");

        System.out.println(v.toString());
        System.out.println("=========");
        System.out.println(c.toString());
        System.out.println("=========");
        System.out.println(j.toString());
        System.out.println("=========");
    }
}
