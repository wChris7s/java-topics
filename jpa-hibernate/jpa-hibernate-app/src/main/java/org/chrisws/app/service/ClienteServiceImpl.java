package org.chrisws.app.service;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.repository.ClientRepositoryImpl;
import org.chrisws.app.repository.CrudRepository;
import org.chrisws.app.util.JpaUtil;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImpl implements ClientService {

   private CrudRepository<Client, Integer> crudRepository;
   private final EntityManager entityManager;

   public ClienteServiceImpl(EntityManager entityManager) {
      this.entityManager = entityManager;
      this.crudRepository = new ClientRepositoryImpl(entityManager);
   }

   @Override
   public List<Client> getAll() {
      return crudRepository.getAll();
   }

   @Override
   public Optional<Client> getById(Integer id) {
      return Optional.ofNullable(crudRepository.getById(id));
   }

   @Override
   public void insert(Client client) {
      try {
         entityManager.getTransaction().begin();
         crudRepository.insert(client);
         entityManager.getTransaction().commit();
      } catch (Exception e) {
         entityManager.getTransaction().rollback();
      }
   }

   @Override
   public void delete(Integer id) {
      try {
         entityManager.getTransaction().begin();
         crudRepository.delete(id);
         entityManager.getTransaction().commit();
      } catch (Exception e) {
         entityManager.getTransaction().rollback();
      }
   }
}
