package excercise2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String phoneNumber;
        System.out.println("❓What number do you want to call???");
        phoneNumber = scanner.nextLine();
        Smartphone nokia = new Smartphone("Nokia", "7600");
        nokia.call(phoneNumber);
        nokia.takePhoto();
        nokia.alarm();
        System.out.println("🚀 I'm an old nokia and can still do all this stuff!! 😂");
    }
}
