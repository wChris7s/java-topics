package org.chrisws.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private String lastname;
   @Column(name = "method_payment")
   private String methodPayment;

   public Client() {
   }

   @Override
   public String toString() {
      return "Client{" +
       "id=" + id +
       ", name='" + name + '\'' +
       ", lastname='" + lastname + '\'' +
       ", methodPayment='" + methodPayment + '\'' +
       '}';
   }
}