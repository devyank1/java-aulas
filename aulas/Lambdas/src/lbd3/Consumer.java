package lbd3;

import java.util.Arrays;
import java.util.List;

public class Consumer {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numeros.forEach(n -> { if ( n % 2 == 0){
            System.out.println(n);}
        });
    }
}
