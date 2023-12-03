package org.example.consumer;

import org.example.models.User;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainConsumer {
   public static void main(String[] args) {
      Integer numero = 20;
      Consumer<Integer> consumer = edad -> {
         edad = edad * 2;
         System.out.println("La edad duplicada es: " + edad);
      };
      consumer.accept(numero);

      BiConsumer<String, Integer> biConsumer = (name, edad) -> {
         edad = edad * 2;
         System.out.println("La edad de " + name + " es "+ edad);
      };
      biConsumer.accept("Chris", numero);

      User admin = new User();
      BiConsumer<User, String> setName = User::setName;
      setName.accept(admin, "Chris");
      System.out.println(admin.getName());
   }
}
