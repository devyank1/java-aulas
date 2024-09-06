package ex05;

public class Car {
    public static void main(String[] args) {

        Attributes attr = new Attributes();

        attr.setModel("Hyundai Creta 1.5");
        attr.setGasConsume(17.4);
        attr.setCalculateAutonomy(10);

        System.out.println(attr.getModel());
        System.out.println(attr.getGasConsume() + " Km/L");
        System.out.println(attr.getCalculateAutonomy());
    }
}
