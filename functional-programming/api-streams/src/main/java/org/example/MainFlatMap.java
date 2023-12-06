package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFlatMap {
   public static void main(String[] args) {
      List<List<Integer>> list = Arrays.asList(
       Arrays.asList(1, 2, 3),
       Arrays.asList(4, 5, 6),
       Arrays.asList(7, 8, 9)
      );

      List<Integer> flatList = list.stream()
       .flatMap(List::stream)
       .collect(Collectors.toList());

      System.out.println(flatList); // Imprime: [1, 2, 3, 4, 5, 6, 7, 8, 9]

      System.out.println();

      String[] phrases = {"Hola mundo", "Hola Java", "Java es divertido"};

      List<String> uniqueWords = Arrays.stream(phrases)
       .map(s -> s.split("\\s+")) // Dividir cada frase en palabras
       .flatMap(Arrays::stream) // Aplanar todas las palabras en un solo flujo
       .distinct() // Obtener palabras únicas
       .collect(Collectors.toList());

      System.out.println(uniqueWords); // Imprime: [Hola, mundo, Java, es, divertido]
   }
}
