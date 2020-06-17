package MusicInstruments;

public class MusicTest {

    //METHOD TESTS
    public static void detuneRetune(Tunable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }

    public static void main(String[] args) {

        //PIANO TYPE
        Piano p1 = new Piano("key", 4);
        System.out.println(p1.getNumberOfKeys());
//
//        //SAX TYPE
        Sax s1 = new Sax("wind", "a small sax");
        System.out.println(s1.getSaxType());
        System.out.println(s1.getSaxType());
//
//        //INTERFACE TYPE
//        System.out.println("Piano 2");
//        VolumeAdjustable p2 = new Piano("key", 50);
//        p2.volumeDown();
//        p2.volumeUp();
        System.out.println("===========");
        detuneRetune(p1);
        System.out.println("===========");
        detuneRetune(s1);
        System.out.println("===========");
        makeTwoStaccatoSounds(p1);
        System.out.println("===========");
        makeTwoStaccatoSounds(s1);


    }
}
