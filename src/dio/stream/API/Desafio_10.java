package dio.stream.API;

import java.util.*;
import java.util.stream.Collectors;

public class Desafio_10 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Map<Integer, List<Integer>> grupos = numeros.stream()
                .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
                .collect(Collectors.groupingBy(numero -> numero));

        grupos.forEach((valor, lista) -> {
            System.out.println("Valor: " + valor + " => Números: " + lista);
        });
    }
}
