package org.example;

import org.example.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
   public static void main(String[] args) {
      List<String> names = new ArrayList<>();
      names.add("Chris");
      names.add("Vale");
      names.add("Mar");

      System.out.println();

      List<String> newNames = names.stream()
       .peek(System.out::println)
       .map((name) -> name.toUpperCase())
       .peek(System.out::println)
       .collect(Collectors.toList());

      System.out.println();
      newNames.forEach(System.out::println);

      System.out.println();
      List<User> newUsers = names.stream()
       .map((name) -> name.toLowerCase())
       .map((name) -> new User(name, null))
       .collect(Collectors.toList());

      newUsers.forEach((user) -> System.out.println(user.getName()));
   }
}
