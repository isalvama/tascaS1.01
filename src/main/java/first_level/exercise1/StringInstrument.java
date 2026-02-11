package first_level.exercise1;

public class StringInstrument extends Instrument {
    private int nStrings;
    public StringInstrument(String name, double price, int nStrings){
        super(name, price);
        this.nStrings = nStrings;
    }

    @Override
    public String play (){
        return "Està sonant un instrument de corda";
    }
}
