package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

import java.util.Scanner;

public class HibernateDelete {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Insert the ID of the client to delete: ");
      Integer id = scanner.nextInt();

      EntityManager entityManager = JpaUtil.getEntityManager();
      try {
         Client client = entityManager.find(Client.class, id);
         entityManager.getTransaction().begin();
         entityManager.remove(client);
         entityManager.getTransaction().commit();
      } catch (Exception e) {
         entityManager.getTransaction().rollback();
      } finally {
         entityManager.close();
      }
   }
}
