import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator_Test {

   Calculator calculator;

   @Before
    public void before() {
       calculator = new Calculator();
   }

   @Test
    public void canAdd() {
       calculator.add(10);
       assertEquals(10, calculator.getResult());
   }

}
