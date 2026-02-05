package FirstLevel.Ex1;

public class PercussionInstrument extends Instrument {
    private static boolean playsNotes = false;
    public PercussionInstrument(String name, double price, boolean playsNotes){

        super(name, price);
        PercussionInstrument.playsNotes = playsNotes;
    }

    @Override
    public String play(){
        return "Està sonant un instrument de percussió";
    }

    public static boolean getplaysNotes(){
        return playsNotes;
    }

    public boolean getplaysNotesInstance(){
        return playsNotes;
    }
}
