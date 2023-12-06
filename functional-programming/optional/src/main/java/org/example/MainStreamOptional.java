package org.example;

import java.util.Arrays;
import java.util.List;

public class MainStreamOptional {
   public static void main(String[] args) {
      List<String> names = Arrays.asList("Chris", "Vale", "Mar");
      String sonName = names.stream()
       .map((name) -> name.toUpperCase())
       .filter((value) -> value.equals("MARQUINHO"))
       .findAny()
       .orElseGet(() -> "MARCINHO");
      System.out.println("sonName = " + sonName);
   }
}
