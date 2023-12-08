# Excepciones

- Una excepción es un evento que ocurre durante la ejecución de un programa que interrumpe el flujo normal de instrucciones.
- Las excepciones pueden ser causadas por una variedad de factores, como errores de entrada, error de lógica, errores de hardware, etc.

## En Java

- En Java son tipos de objetos que proporciona una forma simple y desacoplada el manejo de errores.
- Maneja los errores de forma independiente.
- Nos permite manejar el error y continuar con la ejecución del programa.
- Permite agrupar y diferenciar entre diferentes tipos de errores.
- Propaga errores hacia arriba en la pila de llamadas: StackTrace.
  - Un stacktrace es una lista de las llamadas a métodos que ocurrieron antes de que se produjera una excepción. El
      stacktrace se puede usar para determinar la causa raíz de una excepción.

### try, catch, finally

- Nos permite capturar excepciones, tratarlas, imprimir mensajes de error y continuar con la ejecución del programa.

````java
public class Main {
   public static void main(String[] args) {
      try {
         // Trata de ejecutar un código.
      } catch (Exception e) {
         // Maneja el error, se puede tener varios catch y entra al tipo de excepción que se lanzó.
      } finally {
         // Bloque opcional, siempre se ejecuta, incluso si se lanza una excepción.
      }
   }
}
````

### Tipos de excepciones

- Checked: Son aquellas que el compilador obliga a capturar. Ocurre en tiempo de compilación.
- Unchecked: Son aquellas que el compilador no obliga a capturar. Ocurre en tiempo de ejecución.

### La clase `Throwable`

- La clase `Throwable` es la clase base de todas las excepciones.
- Indica que un objeto es lanzable, es decir, que puede ser lanzado con la palabra reservada `throw`.

### La clase `Error`

- La clase `Error` es de tipo `Unchecked`.
- Son errores de sistema, recursos del sistema, no se puede recuperar de estos errores.

### La clase `Exception`

- La clase `Exception` es de tipo `Checked`.
- Esta clase debe ser tratada con un bloque `try-catch` o propagada con la palabra reservada `throws`.
- Cuando se lanza una excepción, lo que se hace es lanzar una instancia de Exception o de una clase derivada.

```java
public class MyException extends Exception {
   public MyException(String message) {
      super(message);
   }
}
```

### La clase `RuntimeException`

- La clase `RuntimeException` es de tipo `Unchecked`.
- Esta clase no esta obligada a ser tratada con un bloque `try-catch` o propagada con la palabra reservada `throws`, aún así puede ser propagada de forma explícita.
- Cuando se lanza una excepción, lo que se hace es lanzar una instancia de RuntimeException o de una clase derivada.

```java
public class MyRuntimeException extends RuntimeException {
   public MyRuntimeException(String message) {
      super(message);
   }
}
```

### La clausula `throws` y la sentencia `throw`

___

#### `throws`

- Indica que un método puede lanzar una o más excepciones.
- Se utiliza para propagar una excepción hacia arriba en la pila de llamadas.

#### `throw`

- Se utiliza para lanzar una excepción.

___

```java
public class TestChecked {
   public static void verify (int a) throws MyException {
      if (a > 10) {
         throw new MyException("Exception occurred");
      }
   }
}
```

### Constructores y Métodos de la clase ``Exception`` y ``RuntimeException``-

| Constructores | Métodos | Descripción |
| --- | --- | --- |
| `Exception()` <br> `Exception(String message)` | `getMessage()` <br> `printStackTrace()` | - Devuelve el mensaje de la excepción. <br> - Imprime el stacktrace de la excepción. |
| `RuntimeException()` <br> `RuntimeException(String message)` | `getMessage()` <br> `printStackTrace()` | - Devuelve el mensaje de la excepción. <br> - Imprime el stacktrace de la excepción. |

### Herencia de Excepciones

- Las excepciones pueden heredar de otras excepciones.
- Es ideal que al usar excepciones personalizadas estas partan de lo general a lo particular.
  - Esto tambien va orientado a la forma en la que se tratan las excepciones con los bloques `try-catch`. Ya que partimos de lo particular a lo general.
