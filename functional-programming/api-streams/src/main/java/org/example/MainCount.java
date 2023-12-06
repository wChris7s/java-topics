package org.example;

import java.util.stream.Stream;

public class MainCount {
   public static void main(String[] args) {
      long allVale = Stream
       .of("Vale1#1233", "Vale2we#q3", "Vale31231", "Vale4dad213", "Vale5sdads12")
       .filter((name) -> name.startsWith("Vale"))
       .count();
      System.out.println("allVale = " + allVale);
   }
}
