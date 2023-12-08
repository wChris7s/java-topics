package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

import java.util.List;

public class HibernateList {
   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();
      List<Client> clients = entityManager.createQuery("SELECT c FROM Client c", Client.class).getResultList();
      clients.forEach((System.out::println));
      entityManager.close();
   }
}