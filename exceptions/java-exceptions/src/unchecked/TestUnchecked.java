package unchecked;

import unchecked.MyRuntimeException;

public class TestUnchecked {
   public static void verify(int a) {
      if (a > 10) {
         throw new MyRuntimeException("El valor de 'a' no debe ser mayor a 10");
      }
   }
}
