package org.chrisws.app.repository;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.util.JpaUtil;

import java.util.List;
import java.util.Optional;

public class ClientRepositoryImpl implements CrudRepository<Client, Integer> {
   private final EntityManager entityManager;

   public ClientRepositoryImpl(EntityManager entityManager) {
      this.entityManager = entityManager;
   }

   @Override
   public List<Client> getAll() {
      return entityManager
       .createQuery("SELECT c FROM Client c", Client.class)
       .getResultList();
   }

   @Override
   public Client getById(Integer id) {
      return entityManager
       .find(Client.class, id);
   }

   @Override
   public void insert(Client client) {
      if (client.getId() != null && client.getId() > 0) {
         entityManager.merge(client);
      } else {
         entityManager.persist(client);
      }
   }

   @Override
   public void delete(Integer id) {
      Client client = getById(id);
      entityManager.remove(client);
   }
}
