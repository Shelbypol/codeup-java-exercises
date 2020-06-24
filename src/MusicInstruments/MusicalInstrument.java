package MusicInstruments;

public class MusicalInstrument{

    //PRIVATE STRING FIELD
    private String instrumentClassification;

    //EMPTY CONSTRUCTOR
    public MusicalInstrument(){ }

    //CONSTRUCTOR
    public MusicalInstrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    //GETTERS & SETTERS
    public String getInstrumentClassification() {
        return instrumentClassification;
    }
    public void setInstrumentClassification(String instrumentClassification){
        this.instrumentClassification = instrumentClassification;
    }

}
