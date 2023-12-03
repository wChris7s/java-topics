package org.example.predicate;

import java.util.function.Predicate;

public class MainPredicate {
   public static void main(String[] args) {
      Predicate<Integer> test = num -> num > 10;
      boolean b1 = test.test(15);
      boolean b2 = test.test(9);
      System.out.println("b1(15) > 10: " + b1);
      System.out.println("b2(9) > 10: " + b2);
   }
}
