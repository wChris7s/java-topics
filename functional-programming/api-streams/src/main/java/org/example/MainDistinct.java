package org.example;

import org.example.models.User;

import java.util.stream.Stream;

public class MainDistinct {
   public static void main(String[] args) {
      Stream<String> names = Stream.of("Chris", "Vale", "Chris", "Vale", "Vale").distinct();
      names.forEach(System.out::println);

      System.out.println();

      Stream<User> users = Stream.of("Christian Aranibar", "Valeria Nieto", "Mar Aranibar", "Christian Aranibar", "Christian Aranibar")
       .map( (nombre) -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
       .distinct();

      users.forEach(System.out::println);
   }
}
