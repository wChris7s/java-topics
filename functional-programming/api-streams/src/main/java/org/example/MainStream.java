package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {
   public static void main(String[] args) {
      Stream<String> animals = Stream.of("Pato", "Puerco", "Pájaro");
      animals.forEach(System.out::println);

      System.out.println();

      List<String> names = new ArrayList<>();
      names.add("Chris");
      names.add("Vale");
      names.add("Mar");
      names.forEach(System.out::println);
   }
}
