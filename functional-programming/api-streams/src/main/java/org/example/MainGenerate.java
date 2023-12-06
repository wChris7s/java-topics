package org.example;

import java.util.stream.Stream;

public class MainGenerate {
   public static void main(String[] args) {
      Stream.generate(() -> "Hola !")
       .limit(20)
       .forEach(System.out::println);
   }
}
