package FirstLevel;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price){
        super(name, price);
    }

    @Override
    public String play(){
        return "Està sonant un instrument de vent";
    }

}
