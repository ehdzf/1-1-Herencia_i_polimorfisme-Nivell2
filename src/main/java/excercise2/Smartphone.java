package excercise2;

public class Smartphone extends Telephone implements Camera, Clock{


    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("📸 taking photo, smile!!!");
    }

    @Override
    public void alarm() {
        System.out.println("⏰ the alarm is beeping!!!");
    }
}


