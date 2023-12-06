package org.example.models;

import java.util.Objects;

public class User {
   private Integer id;
   private String name;
   private String apellido;

   private static int lastId;
   public User(String name, String apellido) {
      this.name = name;
      this.apellido = apellido;
      this.id = lastId++;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || getClass() != object.getClass()) return false;
      User user = (User) object;
      return Objects.equals(name, user.name) && Objects.equals(apellido, user.apellido);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, apellido);
   }

   @Override
   public String toString() {
      return "User{" +
       "name='" + name + '\'' +
       ", apellido='" + apellido + '\'' +
       '}';
   }
}
