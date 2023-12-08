package checked;

import checked.MyException;

public class TestChecked {
   public static void verify (int a) throws MyException {
      if (a > 10) {
         throw new MyException("El valor de 'a' no debe ser mayor a 10");
      }
   }
}
