package ex05;

public class Attributes {
    private String model;
    private double gasConsume;
    private double calculateAutonomy;

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getGasConsume(){
        return gasConsume;
    }

    public void setGasConsume(double gasConsume){
        this.gasConsume = gasConsume;
    }

    public double getCalculateAutonomy(){
        return calculateAutonomy;
    }

    public void setCalculateAutonomy(double calculateAutonomy){
        this.calculateAutonomy = gasConsume / calculateAutonomy;
    }

}

