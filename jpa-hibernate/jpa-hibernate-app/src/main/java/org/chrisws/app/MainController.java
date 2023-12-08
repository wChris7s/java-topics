package org.chrisws.app;

import jakarta.persistence.EntityManager;
import org.chrisws.app.entity.Client;
import org.chrisws.app.service.ClientService;
import org.chrisws.app.service.ClienteServiceImpl;
import org.chrisws.app.util.JpaUtil;

import java.util.List;
import java.util.Optional;

public class MainController {
   public static void main(String[] args) {
      EntityManager entityManager = JpaUtil.getEntityManager();
      ClientService clientService = new ClienteServiceImpl(entityManager);

      List<Client> clients = clientService.getAll();
      clients.forEach(System.out::println);

      Client client = clientService.getById(4)
       .orElseGet(() -> Client.builder()
        .id(-1)
        .name(null)
        .lastname(null)
        .methodPayment(null)
        .build());
      System.out.println("client = " + client);

      entityManager.close();
   }
}
