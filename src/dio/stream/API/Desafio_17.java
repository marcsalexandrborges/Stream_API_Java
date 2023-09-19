package dio.stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Desafio_17 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> primos = numeros.stream()
                .filter(Desafio_17::ehPrimo) // Filtra apenas os números primos
                .collect(Collectors.toList());

        System.out.println("Números primos: " + primos);
    }

    // Função para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
