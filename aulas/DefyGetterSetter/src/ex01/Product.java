package ex01;

public class Product {
    public static void main(String[] args) {

        Modules modules = new Modules();


        modules.setName("Camisa");
        modules.setPrice(89.9);

        System.out.println(modules.getName());
        System.out.println(modules.getPrice());
    }



}