package org.example.functions;

import org.example.models.User;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainFunctions {
   public static void main(String[] args) {
      Function<String, Integer> getSize = String::length;
      Integer size = getSize.apply("HolaSoyChris");
      System.out.println("size = " + size);
      
      User admin1 = new User();
      admin1.setName("Chris");
      admin1.setLastname("Aranibar");
      User admin2 = new User();
      admin2.setName("Chris");
      admin2.setLastname("Aranibar");
      BiFunction<User, User, Boolean> compare = User::equals;
      Boolean isEquals = compare.apply(admin1, admin2);
      System.out.println("isEquals = " + isEquals);
   }
}
