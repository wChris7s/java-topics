package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import org.chrisws.app.dto.ClientDto;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

import java.util.Arrays;
import java.util.List;

public class HibernateQueryLanguage {
   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();

      System.out.println("| ---- GetAll ---- |");
      List<Client> clients = entityManager
       .createQuery("SELECT c FROM Client c", Client.class)
       .getResultList();
      clients.forEach(System.out::println);

      System.out.println("| ---- GetById ---- |");
      Client client = entityManager.createQuery("SELECT c FROM  Client c WHERE c.id =: idClient", Client.class)
       .setParameter("idClient", 3).getSingleResult();
      System.out.println(client);

      System.out.println(" ---- GetByLastName ---- |");
      List<Client> clients1 = entityManager.createQuery("SELECT c FROM  Client c WHERE c.lastname =: lastname", Client.class)
       .setParameter("lastname", "Aranibar").getResultList();
      clients1.forEach(System.out::println);

      System.out.println("| ---- Query for custom parameters ---- |");
      Object[] clientObject = entityManager.createQuery("SELECT c.id, c.name, c.lastname FROM Client c WHERE c.id = :id", Object[].class)
       .setParameter("id", 1)
       .getSingleResult();
      System.out.println(Arrays.asList(clientObject));

      System.out.println("| ---- Query for custom parameters as list ---- |");
      List<Object[]> objectList = entityManager.createQuery("SELECT c.id, c.name, c.lastname FROM Client c", Object[].class)
       .getResultList();
      objectList.forEach((c) -> System.out.println( c[0] + " " +  c[1] + " " + c[2] ));

      System.out.println("| ---- Query for client and payment method ---- |");
      List<Object[]> objectList1 = entityManager.createQuery("SELECT c, c.methodPayment FROM Client c", Object[].class)
        .getResultList();
      objectList1.forEach((c) -> System.out.println(c[0] + " " + c[1]));

      System.out.println("| ---- Query that constructs and returns an object of a custom class ----|");
      List<ClientDto> clientDto = entityManager.createQuery("SELECT new org.chrisws.app.dto.ClientDto(c.name, c.lastname) from Client c", ClientDto.class)
        .getResultList();
      clientDto.forEach(System.out::println);

      System.out.println("|---- Query with client names ----|");
      List<String> names = entityManager.createQuery("select c.name from Client c", String.class)
       .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query with unique names from clients ----|");
      names = entityManager.createQuery("select distinct(c.name) from Client c", String.class)
        .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query with unique payment method ----|");
      List<String> methods = entityManager.createQuery("select distinct(c.methodPayment) from Client c", String.class)
        .getResultList();
      methods.forEach(System.out::println);

      System.out.println("|---- Check the number of unique payment methods ----|");
      Long total = entityManager.createQuery("select count(distinct(c.methodPayment)) from Client c", Long.class)
       .getSingleResult();
      System.out.println(total);

      System.out.println("|---- Query with concatenated first and last name (1) ----|");
      names = entityManager.createQuery("select concat(c.name, ' ', c.lastname) as fullname from Client c", String.class)
        .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query with concatenated first and last name (2) ----|");
      names = entityManager.createQuery("select c.name || ' ' || c.lastname as fullname from Client c", String.class)
       .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query with first and last name concatenated in capital letters ----|");
      names = entityManager.createQuery("select upper(concat(c.name, ' ', c.lastname)) as fullname from Client c", String.class)
       .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query with first and last name concatenated in lowercase. ----|");
      names = entityManager.createQuery("select lower(concat(c.name, ' ', c.lastname)) as fullname from Client c", String.class)
       .getResultList();
      names.forEach(System.out::println);

      System.out.println("|---- Query to match the name ----|");
      String param = "ar"; // Sensible al case.
      clients = entityManager.createQuery("select c from Client c where  upper(c.name) like upper(:parameter)", Client.class)
       .setParameter("parameter", "%" + param + "%")   // Busca ambos extremos: izq, der.
       .getResultList();
      clients.forEach(System.out::println);

      entityManager.close();
   }
}
