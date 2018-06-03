import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator_Test {

    private static Calculator calculator = new Calculator();

    @Before
    public void before() {
       calculator.reset();
   }

   @Test
    public void canAdd() {
       calculator.add(10);
       assertEquals(10, calculator.getResult());
   }

   @Test
   public void canSubtract() {
      calculator.add(100);
      calculator.subtract(50);
      assertEquals(50, calculator.getResult());
   }

   @Test
   public void canMultiply() {
       calculator.add(10);
       calculator.multiply(10);
       assertEquals(100, calculator.getResult());
   }

}
