# Topics

Las siguientes carpetas contienen información sobre el uso de:

- Programación funcional.
- Threads.
- Exceptions.

## Programación funcional

### Expresiones Lambda

- Implementa un método sin necesidad de crear una clase.

| Tipo de Expresión | Argumentos | Retorno | Método que ejecuta la acción |
|-------------------|------------|---------|------------------------------|
| ``Consumer<T>`` | Recibe un argumento | Realiza una acción y no retorna nada | accept(...) |
| ``BiConsumer<T, U>`` | Recibe dos argumentos | Realiza una acción y no retorna nada | accept(..., ...) |
| ``Supplier<T>`` | No recibe argumentos | Retorna un valor | get() |
| ``Function<T, R>`` | Recibe un argumento | Retorna un valor | apply(...) |
| ``BiFunction<T, U, R>`` | Recibe dos argumentos | Retorna un valor | apply(..., ...) |
| ``Predicate<T>`` | Recibe un argumento | Retorna un valor booleano | test(...) |
| ``BiPredicate<T, U>`` | Recibe dos argumentos | Retorna un valor booleano | test(..., ...) |

### Streams

### Optional

## Threads

## Exceptions
