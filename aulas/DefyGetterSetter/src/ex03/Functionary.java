package ex03;

public class Functionary {
    public static void main(String[] args) {
        Datas datas = new Datas();

        datas.setName("Yan Carlos");
        datas.setAge(24);
        datas.setSalary(3500.0);

        System.out.println("Nome: " + datas.getName());
        System.out.println("Idade: " + datas.getAge());
        System.out.println("Salário: " + datas.getSalary());
    }

}
