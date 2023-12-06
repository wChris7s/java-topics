# Topics

Las siguientes carpetas contienen información sobre el uso de:

- Regex
- Strings
- Programación funcional.
- Threads.
- Exceptions.

## Strings

- Los strings son inmutables.

| Método | Retorna |Descripción |
|--------|---------|------------|
| ``length()`` | ``int`` | Retorna la cantidad de caracteres. |
| ``charAt(int index)`` | ``char`` | Retorna el caracter en la posición indicada. |
| ``concat(String str)`` | ``String`` | Retorna un nuevo string concatenado con el string indicado. |
| ``contains(CharSequence s)`` | ``boolean`` | Retorna un valor booleano si el string contiene la secuencia indicada. |
| ``equals(Object obj)`` | ``boolean`` | Retorna un valor booleano si el string es igual al objeto indicado. |
| ``equalsIgnoreCase(String str)`` | ``boolean`` | Retorna un valor booleano si el string es igual al string indicado, ignorando mayúsculas y minúsculas. |
| ``isEmpty()`` | ``boolean`` | Retorna un valor booleano si el string está vacío. |
| ``replace(char oldChar, char newChar)`` | ``String`` | Retorna un nuevo string reemplazando el caracter indicado por el nuevo caracter indicado. |
| ``split(String regex)`` | ``String[]`` | Retorna un arreglo de strings separados por el regex indicado. |
| ``substring(int beginIndex)`` | ``String`` | Retorna un nuevo string desde el índice indicado hasta el final. |
| ``substring(int beginIndex, int endIndex)`` | ``String`` | Retorna un nuevo string desde el índice inicial indicado hasta el índice final indicado. |
| ``toLowerCase()`` | ``String`` | Retorna un nuevo string con todos los caracteres en minúscula. |
| ``toUpperCase()`` | ``String`` | Retorna un nuevo string con todos los caracteres en mayúscula. |
| ``trim()`` | ``String`` | Retorna un nuevo string sin espacios en blanco al inicio y al final. |

## Regex

- Los regex son expresiones regulares que permiten validar strings.

| Regex | Descripción |
|-------|-------------|
| ``[a-z]`` | Cualquier caracter entre a y z. |
| ``[a-zA-Z]`` | Cualquier caracter entre a y z o entre A y Z. |
| ``[0-9]`` | Cualquier caracter entre 0 y 9. |
| ``[a-z0-9]`` | Cualquier caracter entre a y z o entre 0 y 9. |
| ``[a-z0-9A-Z]`` | Cualquier caracter entre a y z o entre 0 y 9 o entre A y Z. |

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

- Combina las ideas del Iterator y la programación funcional para implementar flujos de datos.
- Los streams no almacenan datos, sino que los procesan.
- Son inmutables.
- Puedes ser creados desde listas, arreglos, rangos, etc.
- Flujos de datos continuos.

#### No terminales

| Operador | Expresión lambda | Descripción |
|----------|------------------|-------------|
| ``map`` | ``Function<T, R>`` | Retorna un stream con los elementos transformados. |
| ``filter`` | ``Predicate<T>`` | Retorna un stream con los elementos que cumplan la condición. |
| ``peek`` | ``Consumer<T>`` | Realiza una inspección sin generar cambios. |
| ``anyMatch`` | ``Predicate<T>`` | Retorna un valor booleano si algún elemento cumple la condición. |
| ``allMatch`` | ``Predicate<T>`` | Retorna un valor booleano si todos los elementos cumplen la condición. |
| ``noneMatch`` | ``Predicate<T>`` | Retorna un valor booleano si ningún elemento cumple la condición. |
| ``findFirst`` | ``Supplier<T>`` | Retorna el primer elemento del stream. |
| ``findAny`` | ``Supplier<T>`` | Retorna cualquier elemento del stream. |
| ``distinct`` | ``Supplier<T>`` | Retorna un stream con elementos únicos. |
| ``mapToInt`` <br> ``mapToLong`` <br> ``mapToDouble`` | ``ToIntFunction<T>`` <br> ``ToLongFunction<T>`` <br> ``ToDoubleFunction<T>`` | Retorna un stream de enteros, longs o doubles. (IntStream, DoubleStream, LongStream) |
| ``flatMap`` | ``Function<T, Stream<R>>`` | Retorna un stream con los elementos transformados. Aplana el stream. |
| ``generate`` | ``Supplier<T>`` | Retorna un stream con los elementos generados. |
| ``limit`` | --------- | Retorna un stream con los elementos limitados. |
| ``skip`` | --------- | Retorna un stream con los elementos saltados. |
| ``sorted`` | ``Comparator<T>`` | Retorna un stream con los elementos ordenados. |
| ``parallel`` | --------- | Hace uso de un pool de Threads para procesar la información. |

#### Terminales

| Operador | Expresión lambda | Descripción |
|----------|------------------|-------------|
| ``forEach`` | ``Consumer<T>`` | Ejecuta una acción por cada elemento del stream. |
| ``count`` | ``Supplier<T>`` | Retorna la cantidad de elementos del stream. |
| ``collect`` | ``Supplier<T>`` | Retorna una colección con los elementos del stream. |
| ``reduce`` | ``BiFunction<T, U, R>`` | Retorna un valor reducido del stream. |
| ``min`` | ``Comparator<T>`` | Retorna el elemento mínimo del stream. |
| ``max`` | ``Comparator<T>`` | Retorna el elemento máximo del stream. |

#### Streams especiales

| Operador | Descripción | Métodos |
|----------|-------------|---------|
| ``IntStream`` | Stream de enteros. | ``range(int startInclusive, int endExclusive)``<br>``rangeClosed(int startInclusive, int endInclusive)`` |
| ``LongStream`` | Stream de longs. | ``range(long startInclusive, long endExclusive)``<br>``rangeClosed(long startInclusive, long endInclusive)`` |
| ``DoubleStream`` | Stream de doubles. | ``range(double startInclusive, double endExclusive)``<br>``rangeClosed(double startInclusive, double endInclusive)`` |

| Operador | Métodos Especiales |
|----------|--------------------|
| ``IntStream, LongStream, DoubleStream`` | ``sum()``<br>``average()``<br>``max()``<br>``min()``<br>``summaryStatistics()`` |
| ``summaryStatistics()`` | ``getCount()``<br>``getSum()``<br>``getAverage()``<br>``getMax()``<br>``getMin()`` |

### Optional

- Da una capa de seguridad para evitar el uso de valores nulos.
- Evita lanzamientos de NullPointerException.

| Método | Retorna |Descripción |
|--------|---------|------------|
| ``empty()`` | ``Optional`` | Retorna un optional vacío. |
| ``of(T value)`` | ``Optional`` | Retorna un optional con el valor indicado. (Usarlo si estamos seguro de que el valor existe.) |
| ``ofNullable(T value)`` | ``Optional`` | Retorna un optional con el valor indicado o un optional vacío si el valor es nulo. |
| ``get()`` | ``T`` | Retorna el valor del optional. |
| ``isPresent()`` | ``boolean`` | Retorna un valor booleano si el optional contiene un valor. |
| ``ifPresent(Consumer<T> consumer)`` | ``void`` | Ejecuta una acción si el optional contiene un valor. |
| ``ifPresentOrElse(Consumer<T> consumer, Runnable runnable)`` | ``void`` | Ejecuta una acción si el optional contiene un valor o ejecuta una acción si el optional está vacío. |
| ``orElse(T other)`` | ``T`` | Retorna el valor del optional o el valor indicado si el optional está vacío. Independientemente si se encuentra o no, se crea el objeto por defecto si o si. Esto consume recursos. |
| ``orElseGet(Supplier<T> supplier)`` | ``T`` | Retorna el valor del optional o el valor indicado por el supplier si el optional está vacío. |
| ``orElseThrow(Supplier<Exception> supplier)`` | ``T`` | Retorna el valor del optional o lanza una excepción indicada por el supplier si el optional está vacío. |

#### Streams con Optional

| Stream | Optional | Descripción |
|--------|----------|-------------|
| ``findFirst()`` | ``Optional`` | Retorna el primer elemento del stream. |
| ``findAny()`` | ``Optional`` | Retorna cualquier elemento del stream. |
| ``min()`` | ``Optional`` | Retorna el elemento mínimo del stream. |
| ``max()`` | ``Optional`` | Retorna el elemento máximo del stream. |
| ``reduce()`` | ``Optional`` | Retorna un valor reducido del stream. |

## Threads

## Exceptions
