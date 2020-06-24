package MusicInstruments;

public class Sax extends MusicalInstrument implements Tunable, VolumeAdjustable {

    //PRIVATE FIELD
    private String saxType;

    //CONSTRUCTOR
    public Sax(String instrumentClassification, String saxType){
        super(instrumentClassification);
        this.saxType = saxType;
    }

    //TUNABLE INTERFACE
    @Override
    public void tuneInstrument() {
        System.out.println("...Tuning sax...");
    }
    @Override
    public void detuneInstrument() {
        System.out.println("...detune sax...");
    }

    //VOLUME ADJUSTABLE INTERFACE
    @Override
    public void volumeUp() {
        System.out.println("SAX VOLUME UP");
    }
    @Override
    public void volumeDown() {
        System.out.println("sax volume down");
    }

    //GETTERS & SETTERS
    public String getSaxType() {
        return saxType;
    }
    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }
}
