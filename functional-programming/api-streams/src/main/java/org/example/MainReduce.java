package org.example;

import java.util.stream.Stream;

public class MainReduce {
   public static void main(String[] args) {
      Stream<Integer> numbers = Stream.of(1,4,5,6,7,2,4);
      Integer resultNumbers = numbers.reduce(0, (a, b) -> a + b);
      System.out.println("resultNumbers = " + resultNumbers);

      Stream<String> names = Stream.of("Chris", "Vale", "Mar", "Alice");
      String resultString = names.reduce("String -> ", (a, b) -> a + " " + b);
      System.out.println("resultString = " + resultString);
   }
}
