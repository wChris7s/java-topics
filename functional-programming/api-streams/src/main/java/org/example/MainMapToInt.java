package org.example;

import org.example.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainMapToInt {
   public static void main(String[] args) {
      IntStream users = Stream.of("Christian Aranibar", "Valeria Nieto", "Mar Aranibar", "Christian Aranibar", "Christian Aranibar")
       .map( (nombre) -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
       .distinct()
       .mapToInt((user) -> user.toString().length());

      IntSummaryStatistics statistics = users.summaryStatistics();
      System.out.println(statistics.getMax());
      System.out.println(statistics.getCount());
      System.out.println(statistics.getMin());
      System.out.println(statistics.getAverage());
      System.out.println(statistics.getSum());
   }
}
