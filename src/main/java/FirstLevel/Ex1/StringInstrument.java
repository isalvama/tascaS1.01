package FirstLevel.Ex1;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, double price){
        super(name, price);
    }
    public String play (){
        return "Està sonant un instrument de corda";
    }
}
