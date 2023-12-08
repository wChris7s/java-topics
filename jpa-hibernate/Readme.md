# Java Persistence API (JPA) con Hibernate

## Hibernate

- Es una herramienta de mapeo objeto relacional (ORM) que permite trabajar los datos de una base de datos (RDBMS) en forma de clases y objetos.

## JPA

- Es una especificación de Java que permite mapear objetos a una base de datos relacional.
- JPA define un estándar de características que deben cumplir los frameworks de mapeo objeto-relacional (ORM) para Java. Hibernate es una implementación de JPA.

## Spring Data JPA and Hibernate JPA

- Spring Data JPA es una librería que permite trabajar con JPA de una forma más sencilla. Hibernate es una implementación de JPA.
- Spring Data JPA es una capa adicional de abstracción que hace uso de JPA, facilitando el desarrollo al proporcionar funciones adicionales y simplificar el acceso a la base de datos. En muchos casos, Spring Data JPA utiliza Hibernate como la implementación subyacente de JPA.

## Entity

| Anotación | Descripción |
| --- | --- |
| ``@Entity`` | Indica que la clase es una entidad. |
| ``@Table`` | Indica el nombre de la tabla que se va a mapear. |
| ``@Id`` | Indica que el atributo es una llave primaria. |
| ``@GeneratedValue`` | Indica que el valor de la llave primaria es generado automáticamente. |
| ``@Column`` | Indica el nombre de la columna que se va a mapear. |
| ``@Transient`` | Indica que el atributo no se va a mapear. |

## DTO (Data Transfer Object)

- Es un patrón de diseño que permite transferir datos entre subsistemas de un software. En este caso, se utiliza para transferir datos entre la capa de persistencia y la capa de presentación.

## Asoaciaciones

- La relación es dada entre el entity y el atributo que representa la relación.

| Anotación | Descripción |
| --- | --- |
| ``@OneToOne`` | Indica una relación uno a uno. |
| ``@OneToMany`` | Indica una relación uno a muchos. |
| ``@ManyToOne`` | Indica una relación muchos a uno. |
| ``@ManyToMany`` | Indica una relación muchos a muchos. |

## Clases, Métodos

| Clase | Métodos y parametros | Funcionalidad |
| --- | --- | --- |
| ``EntityManagerFactory`` | ``createEntityManager()`` | Crea un objeto EntityManager que nos permite realizar operaciones de persistencia en la base de datos. |
| ``Persistence`` | ``createEntityManagerFactory  ("persistence-unit-name")`` | Crea un objeto EntityManagerFactory a partir de una unidad de persistencia definida en el archivo de configuración persistence.xml. |
| ``EntityManager`` | ``close()`` | Cierra el objeto EntityManager, esto permite liberar los recursos asociados y finalizar la interacción con la base de datos. |
| ``EntityManager`` | ``createQuery("JPQL")`` | Crea un objeto Query a partir de una consulta JPQL. |
| ``EntityManager`` | ``creteQuery("JPQL", Clase.class)`` | Crea un objeto Query a partir de una consulta JPQL. |
| ``EntityManager`` | ``createQuery("JPQL", Clase.class)  .setParameter(String s, Object o)`` | Crea un objeto Query a partir de una consulta JPQL y asigna un valor a un parámetro de la consulta [``=?1``]. |
| ``EntityManager`` | ``createQuery("JPQL", Clase.class)  .setParameter(int i, Object o)`` | Crea un objeto Query a partir de una consulta JPQL y asigna un valor a un parámetro de la consulta [``=:name``]. |
| ``EntityManager`` | ``find(Clase.class, id)`` | Busca un objeto por su llave primaria. El objeto consultado se guarda en la memoria cache. |
| ``EntityManager`` | ``getTransaction()`` | Devuelve un objeto EntityTransaction que permite realizar transacciones. |
| ``EntityManager`` | ``getTransaction().begin()`` | Inicia una transacción. |
| ``EntityManager`` | ``getTransaction().commit()`` | Confirma una transacción. |
| ``EntityManager`` | ``getTransaction().rollback()`` | Cancela una transacción. |
| ``EntityManager`` | ``persist(objeto)`` | Guarda un objeto en la base de datos. |
| ``EntityManager`` | ``merge(objeto)`` | Actualiza un objeto en la base de datos. |
| ``EntityManager`` | ``remove(objeto)`` | Elimina un objeto de la base de datos. |
| ``Query`` | ``setParameter(String s, Object o)``  ``setParameter(int i, Object o)`` | Asigna un valor a un parámetro de la consulta. |
| ``Query`` | ``getResultList()`` | Ejecuta la consulta y devuelve una lista de resultados. |
| ``Query`` | ``getSingleResult()`` | Ejecuta la consulta y devuelve un único resultado. |
| ``Query`` | ``setMaxResults(max)`` | Establece el número máximo de resultados a devolver. |
