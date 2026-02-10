package FirstLevel.Ex2;

public class MainCar {
    public static void main (String[] args){
        Car.brake();
        System.out.println(Car.getBrand());
        System.out.println(Car.getModel());
        Car car1 = new Car(200, "Prius");
        car1.accelerate();
        car1.brake();
    }
}
