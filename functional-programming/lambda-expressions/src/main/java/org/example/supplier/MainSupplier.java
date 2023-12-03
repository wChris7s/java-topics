package org.example.supplier;

import org.example.models.User;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class MainSupplier {
   public static void main(String[] args) {
      Supplier<Integer> adminPassword = () -> 12 * 3 - 1;
      System.out.println("adminPassword = " + adminPassword.get());

      Supplier<User> createUser = User::new;
      User admin = createUser.get();
      BiConsumer<User, String> setName = User::setName;
      setName.accept(admin, "Koko");
      System.out.println("admin = " + admin.getName());
   }
}
