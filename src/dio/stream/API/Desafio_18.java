package dio.stream.API;

import java.util.Arrays;
import java.util.List;


public class Desafio_18 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1);

        long numeroDeElementosDistintos = numeros.stream()
                .distinct()
                .count();

        if (numeroDeElementosDistintos == 1) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números não são todos iguais.");
        }
    }
}
