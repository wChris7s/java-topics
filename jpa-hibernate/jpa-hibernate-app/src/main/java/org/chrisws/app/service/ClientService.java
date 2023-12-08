package org.chrisws.app.service;

import org.chrisws.app.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
   List<Client> getAll();
   Optional<Client> getById(Integer id);
   void insert(Client client);
   void delete(Integer id);
}
