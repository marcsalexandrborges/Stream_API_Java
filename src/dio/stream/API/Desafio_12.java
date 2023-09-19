package dio.stream.API;

import java.util.Arrays;
import java.util.List;


public class Desafio_12 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usamos 1 como valor inicial para a multiplicação
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Produto dos números: " + produto);
    }
}
