package ex02;

public class Rectangle {
    public static void main(String[] args) {
        Sides s = new Sides();

        s.setHeight(10);
        s.setWidth(90);
        s.setConcat(s.getHeight() * s.getWidth());

        System.out.println("Sua altura é: " + s.getHeight() + "m.");
        System.out.println("Sua largura é: " + s.getWidth() + "m.");
        System.out.println("A sua área é: " + s.getConcat() + "m.");
    }

}
