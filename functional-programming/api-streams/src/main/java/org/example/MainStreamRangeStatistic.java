package org.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MainStreamRangeStatistic {
   public static void main(String[] args) {
      IntStream numbers = IntStream.range(1, 5);
      System.out.println("numbers = " + numbers);

      // int sum = numbers.sum();
      // System.out.println("sum = " + sum);

      IntSummaryStatistics statistics = numbers.summaryStatistics();
      int max = statistics.getMax();
      int min = statistics.getMin();

      System.out.println("min = " + min);
      System.out.println("max = " + max);
   }
}
