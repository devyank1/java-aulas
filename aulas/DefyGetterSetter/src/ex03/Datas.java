package ex03;

public class Datas {
    private String name;
    private double salary;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == ""){
            System.out.println("ERRO! Informe o seu nome para prosseguir!");
        }else{
            this.name = name;
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary < 0){
            System.out.println("ERRO! O salário não pode ser NEGATIVO!");
        }else{
            this.salary = salary;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 18){
            System.out.println("ERRO! Impossível de trabalhar com menos de 18 ANOS aqui!");
        }else{
            this.age = age;
        }
    }
}
