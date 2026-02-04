package FirstLevel;

public class PercussionInstrument extends Instrument{
    public PercussionInstrument(String name, double price){
        super(name, price);
    }

    public String play(){
        return "Està sonant un instrument de percussió";
    }
}
