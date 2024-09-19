package lbd04;

import java.util.List;
import java.util.stream.Stream;

public class Supplier {

    public static void main(String[] args) {

        java.util.function.Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
                .limit(3)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
