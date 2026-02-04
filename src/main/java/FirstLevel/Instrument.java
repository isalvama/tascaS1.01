package FirstLevel;

abstract public class Instrument {
    private String name;
    private double price;

    public Instrument (String name, double price){
        this.name = name;
        this.price = checkPrice(price);
    }

    public abstract String play();

    private double checkPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("The base level weight number must be positive");
        }
        return price;
    }

}
