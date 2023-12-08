package org.chrisws.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {
   private String name;
   private String lastname;

   public ClientDto(String name, String lastname) {
      this.name = name;
      this.lastname = lastname;
   }

   @Override
   public String toString() {
      return "ClientDto{" +
       "name='" + name + '\'' +
       ", lastname='" + lastname + '\'' +
       '}';
   }
}
