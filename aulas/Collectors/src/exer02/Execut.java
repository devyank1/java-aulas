package exer02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execut {
    public static void main(String[] args) {

        List<Pessoa> l =  new ArrayList<Pessoa>();

        l.add(new Pessoa("Joca",27, 'M'));
        l.add(new Pessoa("Caique",13,'M'));
        l.add(new Pessoa("Luana",65,'F'));
        l.add(new Pessoa("Fabiana",25,'F'));

        Collections.sort(l);

        for (Pessoa p : l) {
            System.out.println(p.getNome());
        }
    }
}
