package org.example;

import org.example.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {
   public static void main(String[] args) {
      List<String> names = new ArrayList<>();
      names.add("Chris");
      names.add("Vale");
      names.add("Mar");
      names.add("Ol");

      List<User> users = names.stream()
       .filter((name) -> name.length() > 2)
       .map((name) -> new User(name, null))
       .collect(Collectors.toList());

      users.forEach((user) -> System.out.println(user.getName()));

      User admin = users.stream()
       .filter((user) -> user.getId().equals(1))
       .findFirst()
       .get();

      System.out.println("Admin: " + admin.getName());
   }
}
