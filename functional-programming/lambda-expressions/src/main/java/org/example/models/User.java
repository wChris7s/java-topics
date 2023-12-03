package org.example.models;

import java.util.Objects;

public class User {
   String name;
   String lastname;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || getClass() != object.getClass()) return false;
      User user = (User) object;
      return Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, lastname);
   }
}
