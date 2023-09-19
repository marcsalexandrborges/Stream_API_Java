package dio.stream.API;

import java.util.Arrays;
import java.util.List;


public class Desafio_11 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int somaDosQuadrados = numeros.stream()
                .map(numero -> numero * numero) // Eleva ao quadrado
                .reduce(0, (a, b) -> a + b); // Soma

        System.out.println("Soma dos quadrados: " + somaDosQuadrados);
    }

}
