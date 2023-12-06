package org.example;

import java.util.stream.Stream;

public class MainAnyMatchAllMatch {
   public static void main(String[] args) {
      boolean existe = Stream
       .of("Chris", "Vale1", "Vale2", "Vale3", "Mar")
       .anyMatch((name) -> name.startsWith("Vale"));

      System.out.println("existe = " + existe);

      boolean allChris = Stream
       .of("Chris", "Vale1", "Vale2", "Vale3", "Mar")
       .allMatch((name) -> name.equals("Chris"));

      System.out.println("allChris = " + allChris);

      boolean allVale = Stream
       .of("Vale1#1233", "Vale2we#q3", "Vale31231", "Vale4dad213", "Vale5sdads12")
       .allMatch((name) -> name.startsWith("Vale"));

      System.out.println("allVale = " + allVale);
   }
}
