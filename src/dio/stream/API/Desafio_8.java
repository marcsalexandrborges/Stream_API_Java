package dio.stream.API;

import java.util.Arrays;
import java.util.List;

public class Desafio_8 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .mapToInt(Desafio_8::somarDigitos)
                .sum();

        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);
    }

    // Função para somar os dígitos de um número
    public static int somarDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10; // Pega o último dígito
            numero /= 10; // Remove o último dígito
        }
        return soma;
    }

}
