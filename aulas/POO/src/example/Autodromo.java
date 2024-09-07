package example;

public class Autodromo {
    public static void main(String[] args) {

        Car kart = new Car();
        kart.setChassi("123");
        kart.ligarMotor();

        Motorcycle mt03 = new Motorcycle();
        mt03.setChassi("456");
        mt03.ligarMotor();
    }

}
