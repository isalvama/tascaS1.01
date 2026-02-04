package FirstLevel;

import java.util.ArrayList;

public class MainInstrument {
    public static void main (String[] args){
        StringInstrument classicalGuitar = new StringInstrument("classical guitar", 100.00);
        StringInstrument electricGuitRar = new StringInstrument("electric guitar", 140.00);
        StringInstrument piano = new StringInstrument("piano", 4000.00);

        WindInstrument flute = new WindInstrument("flute", 20);

        PercussionInstrument drum = new PercussionInstrument("drum", 700.00);

        ArrayList<Instrument> instrumentList = new ArrayList<>();

        instrumentList.add(classicalGuitar);
        instrumentList.add(electricGuitRar);
        instrumentList.add(piano);
        instrumentList.add(flute);
        instrumentList.add(drum);

        for (Instrument instrument : instrumentList){
            System.out.println(instrument + " " + instrument.getName() + " with price " + instrument.getPrice() + " is played like: " + instrument.play());
        }


    }
}
