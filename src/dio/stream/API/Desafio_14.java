package dio.stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Desafio_14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio_14::ehPrimo) // Filtra apenas os números primos
                .max(Integer::compareTo); // Encontra o maior

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
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
