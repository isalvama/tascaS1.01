package SecondLevel.Ex1;

public class SmartPhone extends Phone implements Clock, Camera {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void soundAlarm() {
        System.out.println("Beep beep");
    }

    @Override
    public void takePhoto(){
        System.out.println("click");
    }
}
