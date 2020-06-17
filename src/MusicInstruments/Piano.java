package MusicInstruments;

public class Piano extends MusicalInstrument implements VolumeAdjustable, Tunable{

    //PRIVATE FIELD
    private int numberOfKeys;

    //CONSTRUCTOR
    public Piano(String e, int numberOfKeys){
        super(e);
        this.numberOfKeys = numberOfKeys;
    }

    //TUNABLE INTERFACE
    @Override
    public void tuneInstrument() {
        System.out.println("...Tuning piano...");
    }
    @Override
    public void detuneInstrument() {
        System.out.println("...detune piano...");
    }

    //VOLUME ADJUSTABLE INTERFACE
    @Override
    public void volumeUp() {
        System.out.println(" PIANO VOLUME UP");
    }
    @Override
    public void volumeDown() {
        System.out.println(" piano volume down");
    }

    //GETTERS & SETTERS
    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}
