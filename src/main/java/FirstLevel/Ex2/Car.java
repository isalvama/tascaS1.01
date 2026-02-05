package FirstLevel.Ex2;

public class Car {
    private static final String brand = "Toyota";
    private static String model = "2026";
    private final int power;

    public Car (int power, String model) {
        this.power = power;
    }

    public static void brake(){
        System.out.println("El vehicle està frenant");
    }

    public static void accelerate(){
        System.out.println("El vehicle està accelerant");
    }

    public static String getBrand(){
        return brand;
    }
    public static String getModel(){
        return model;
    }

}
