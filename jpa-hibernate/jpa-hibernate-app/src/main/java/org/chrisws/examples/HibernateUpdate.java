package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

import javax.swing.*;

public class HibernateUpdate {

   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();
      try {
         Integer id = Integer.valueOf(JOptionPane.showInputDialog("Insert the id of the client you want to modify"));
         Client client = entityManager.find(Client.class, id);

         String name = JOptionPane.showInputDialog("Insert name:", client.getName());
         String lastname = JOptionPane.showInputDialog("Insert lastname:", client.getLastname());
         String payment = JOptionPane.showInputDialog("Insert payment method:", client.getMethodPayment());

         entityManager.getTransaction().begin();
         client.setName(name);
         client.setLastname(lastname);
         client.setMethodPayment(payment);
         entityManager.merge(client);
         entityManager.getTransaction().commit();
      } catch (Exception e) {
         entityManager.getTransaction().rollback();
      } finally {
         entityManager.close();
      }
   }
}
