package org.example;

import java.util.function.Function;

public class Main {
   public static void main(String[] args) {
      String text  = "HOLA DSMV SD  DS ,AM";
      Function<String, String> deleteBlankSpaces = (data) -> data.replace(" ", "")
       .replace(".", "")
       .replace(",", "")
       .toUpperCase();
      System.out.println(deleteBlankSpaces.apply(text));
   }
}