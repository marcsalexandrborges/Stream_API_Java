package dio.stream.API;

import java.util.Arrays;
import java.util.List;

public class Desafio_13 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10)
                .toList();

        System.out.println("Números no intervalo: " + numerosNoIntervalo);
    }
}
