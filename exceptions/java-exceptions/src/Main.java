import checked.MyException;
import checked.TestChecked;
import unchecked.TestUnchecked;

public class Main {
   public static void main(String[] args) {
      // testCheckedTreatment();
      // testCheckedWithoutTreatment();   // Necesita de try-catch o propagación con throws.
      // unchecked();
   }

   static void testCheckedTreatment() {
      try {
         TestChecked.verify(12);
      } catch (MyException e) {
         System.out.println("Ocurrió un error [" + e + "]");
      }
   }

   static void testCheckedWithoutTreatment() throws MyException {
      TestChecked.verify(12);
   }

   static void unchecked() {
      TestUnchecked.verify(15);
   }
}