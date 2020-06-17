package MusicInstruments;

public class MusicalInstrument implements Playable {

    //PRIVATE STRING FIELD
    private String instrumentClassification;

    //EMPTY CONSTRUCTOR
    public MusicalInstrument(){ }

    //CONSTRUCTOR
    public MusicalInstrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    //PLAYABLE INTERFACE
    @Override
    public void startMusic() {

    }
    @Override
    public void stopMusic() {

    }


    //GETTERS & SETTERS
    public String getInstrumentClassification() {
        return instrumentClassification;
    }
    public void setInstrumentClassification(String instrumentClassification){
        this.instrumentClassification = instrumentClassification;
    }

}
