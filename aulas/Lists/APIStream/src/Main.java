import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 12);

        // 1. MOSTRE A LISTA NA ORDEM NUMÉRICA.

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("A SUA LISTA ORDENADA É: " + numerosOrdenados);

        //2. SOMAS DOS NUMEROS PARES.

        int somaDosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A SOMA DOS VALORES PARES SÃO: " + somaDosPares);

        //3. VERIFIQUE SE OS NUMEROS SAO POSITIVOS.

        List<Integer> numerosPositivos = numeros.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        System.out.println("OS NÚMEROS POSITIVOS SÃO: " + numerosPositivos);

        //4. REMOVA TODOS OS VALORES IMPARES.

        List<Integer> removendoValoresImpares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("SOMENTE OS VALORES PARES DE SUA LISTA ORDENADOS: " + removendoValoresImpares);

        //5. CALCULAR A MEDIA DOS VALORES MAIORES QUE 5.

        OptionalDouble mediaMaioresCinco = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average(); // CALCULAR A MÉDIA

        if (mediaMaioresCinco.isPresent()) {
            System.out.println("MÉDIA DOS NUMEROS MAIORES QUE 5 SÃO: " + mediaMaioresCinco.getAsDouble());
        } else {
            System.out.println("NENHUM NÚMERO MAIOR QUE CINCO FOI ENCONTRADO");
        }

        //6. VER SE TEM ALGUM NUMERO MAIOR QUE 10.

        List<Integer> numerosMaioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        if (!numerosMaioresQueDez.isEmpty()) {
            System.out.println(numerosMaioresQueDez);
        } else {
            System.out.println("NÃO EISTEM NÚMEROS MAIORES QUE O DEZ.");
        }

        //7. ENCONTRAR O SEGUNDO MAIOR NUMERO DA LISTA

        Optional<Integer> segundoMaiorNumeroLista = numeros.stream()
                .distinct() // RETIRA OS NUMEROS REPETIDOS
                .sorted((a, b) -> b - a) // B - A PARA PEGAR DO MAIOR AO MENOR
                .skip(1) // PULA O ULTIMO NUMERO POR CONTA DO B - A
                .findFirst(); // PEGAR O PRIMEIRO APOS O SKIP

        if (segundoMaiorNumeroLista.isPresent()) {
            System.out.println("O SEGUNDO MAIOR NÚMERO É:  " + segundoMaiorNumeroLista.get());
        } else {
            System.out.println("NÃO FOI POSSÍVEL ENCONTRAR O SEGUNDO MAIOR NÚMERO");
        }


        //8. SOMAR TODOS OS NUMEROS

        int somaTodosNumeros = numeros.stream()
                .map(String::valueOf) //CONVERTE O NUM EM STRING
                .flatMapToInt(n -> n.chars()) //TRANSFORMA CADA NUMERO EM SEUS CARACTERES
                .map(Character::getNumericValue) //CONVERTE CADA CARACTERE DE VOLTA PARA SEU VALOR NUMÉRICO
                .sum();

        System.out.println("A SOMA DE TODOS OS NUMEROS SÃO: " + somaTodosNumeros);

        //9. VERIFICAR SE TODOS OS NUMEROS DA LISTA SAO DISTINTOS
        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numerosDistintos);

        //10. MULTIPLOS DE 3 E 5
        Map<String, List<Integer>> resultado = numeros.stream()
                // Filtrar apenas os números ímpares
                .filter(num -> num % 2 != 0)
                // Filtrar múltiplos de 3 ou 5
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                // Coletar os resultados em grupos de acordo com algum critério, aqui vamos agrupar por múltiplo de 3 ou 5
                .collect(Collectors.groupingBy(num -> {
                    if (num % 3 == 0 && num % 5 == 0) {
                        return "Múltiplo de 3 e 5";
                    } else if (num % 3 == 0) {
                        return "Múltiplo de 3";
                    } else {
                        return "Múltiplo de 5";
                    }
                }));
        System.out.println(resultado);
    }
}