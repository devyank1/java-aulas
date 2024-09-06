package classes;

public class Pessoa {
    private String name =  "yan";
    private int age;
    private double height;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name.toUpperCase();
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
