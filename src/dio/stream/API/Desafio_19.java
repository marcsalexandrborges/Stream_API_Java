package dio.stream.API;

import java.util.Arrays;
import java.util.List;

public class Desafio_19 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20);

        int soma = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .mapToInt(Integer::intValue) // Converte para um IntStream
                .sum();

        System.out.println("Soma dos números divisíveis por 3 e 5: " + soma);
    }
}
