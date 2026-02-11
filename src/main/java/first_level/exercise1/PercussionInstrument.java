package first_level.exercise1;

public class PercussionInstrument extends Instrument {
    private static boolean playsNotes = false;
    public PercussionInstrument(String name, double price, boolean playsNotes){
        super(name, price);
        PercussionInstrument.playsNotes = playsNotes;
    }
    public PercussionInstrument(String name, double price){
        super(name, price);
    }

    @Override
    public String play(){
        return "Està sonant un instrument de percussió";
    }

    public static boolean getPlaysNotes(){
        return playsNotes;
    }

    public boolean getPlaysNotesInstance(){
        return playsNotes;
    }
}
