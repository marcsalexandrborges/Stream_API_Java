package dio.stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Desafio_7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Removemos números duplicados
                .sorted((a, b) -> b - a) // Ordenamos em ordem decrescente
                .skip(1) // Ignoramos o maior número
                .findFirst(); // Pegamos o primeiro da lista restante

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo número maior na lista.");
        }
    }
}
