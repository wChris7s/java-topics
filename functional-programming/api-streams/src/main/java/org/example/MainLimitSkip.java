package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainLimitSkip {
   public static void main(String[] args) {
      List<String> names = Stream.of("Chris", "Vale", "Mar", "Alice", "Chris")
       .limit(2)
       .collect(Collectors.toList());

      System.out.println("names = " + names);

      List<Integer> numbers = Stream.of(1, 2, 3, 4, 1, 0)
       .sorted()
       .skip(4)
       .collect(Collectors.toList());

      System.out.println("numbers = " + numbers);
   }
}
