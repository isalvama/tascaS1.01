package FirstLevel.Ex2;

public class Car {
    private static final String BRAND = "Toyota";
    private static String model = "2026";
    private final int power;

    public Car (int power) {
        this.power = power;
    }
    public Car (int power, String model) {
        this.power = power;
        Car.model = model;
    }

    public static String getBrand(){
        return BRAND;
    }
    public static String getModel(){
        return model;
    }

    public static void brake(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerate(){
        System.out.println("El vehicle està accelerant");
    }
}
