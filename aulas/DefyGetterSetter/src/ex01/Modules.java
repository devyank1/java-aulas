package ex01;

public class Modules {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price < 0){
            System.out.println("O valor não pode ser negativo!");
        }else{
            this.price = price;
        }
    }

}
