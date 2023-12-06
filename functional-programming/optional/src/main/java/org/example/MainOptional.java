package org.example;

import java.util.Optional;

public class MainOptional {
   public static void main(String[] args) {
      String name = "Christian";
      Optional<String> optional = Optional.of(name);
      System.out.println("optional = " + optional);
      System.out.println(optional.isPresent());
      optional.ifPresent((value) -> {
         System.out.println("Estoy presente, soy: " + value);
      });

      name = null;
      Optional<String> optional1 = Optional.ofNullable(name);
      optional1.ifPresentOrElse(
       (value) -> System.out.println("Hola, estoy presente, soy: " + value),
       () -> System.out.println("No estoy presente :(")
      );

      String name1 = optional1.orElse("Vale");  // Consume recursos.
      System.out.println("name1 = " + name1);

      String name2 = optional1.orElseGet(() -> "Vale " + 12 * 21 + " Mar");
      System.out.println("name2 = " + name2);

      String name3 = optional1.orElseThrow(NullPointerException::new);
      System.out.println("name3 = " + name3);
   }
}
