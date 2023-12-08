package org.chrisws.app.repository;

import java.util.List;

public interface CrudRepository<T, U> {
   List<T> getAll();
   T getById(U id);
   void insert(T data);
   void delete(U id);
}
