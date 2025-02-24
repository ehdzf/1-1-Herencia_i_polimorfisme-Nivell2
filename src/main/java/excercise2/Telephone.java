package excercise2;

public class Telephone {
    private String brand;
    private String model;
    public void call(String phoneNumber){
        System.out.printf("📞 calling %1$s\n", phoneNumber);
    }

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
