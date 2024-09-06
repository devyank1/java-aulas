import classes.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("YAn carlos");
        pessoa.setHeight(1.83);
        pessoa.setAge(24);

        System.out.println(pessoa.getAge());
        System.out.println(pessoa.getHeight());
        System.out.println(pessoa.getName());
    }

}