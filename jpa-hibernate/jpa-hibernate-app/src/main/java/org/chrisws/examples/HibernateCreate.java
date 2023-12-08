package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class HibernateCreate {
   private static final Logger logger = LoggerFactory.getLogger(HibernateCreate.class);

   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();
      try {
         String name = JOptionPane.showInputDialog("Insert username:");
         String lastname = JOptionPane.showInputDialog("Insert lastname:");
         String payment = JOptionPane.showInputDialog("Insert payment method:");

         entityManager.getTransaction().begin();
         Client client = Client
          .builder()
          .name(name)
          .lastname(lastname)
          .methodPayment(payment)
          .build();
         entityManager.persist(client);
         entityManager.getTransaction().commit();
         logger.info("User with id-" + client.getId() + " was created.");
      } catch (Exception e) {
         entityManager.getTransaction().rollback();
         e.printStackTrace();
      } finally {
         entityManager.close();
      }
   }
}
