package SecondLevel.Ex1;

 abstract public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String call (int phone){
        return "This phone is currently calling phone number " + phone;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }


}
