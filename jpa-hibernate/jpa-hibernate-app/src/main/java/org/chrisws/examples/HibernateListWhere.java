package org.chrisws.examples;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

public class HibernateListWhere {
   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();
      Query query = entityManager.createQuery("SELECT c FROM Client c WHERE c.methodPayment = ?1", Client.class);
      // query.setMaxResults(1);
      query.setParameter(1, "Credito");
      Client client = (Client) query.getSingleResult();
      System.out.println("client = " + client);

      int id = 1;
      Client client1 = entityManager.find(Client.class, id);
      System.out.println("client1 = " + client1);
      entityManager.close();
   }
}
