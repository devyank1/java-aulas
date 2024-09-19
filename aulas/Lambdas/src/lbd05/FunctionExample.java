package lbd05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25);

        Function<Integer, Integer> dobrar = numero -> numero * 2 ;

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
