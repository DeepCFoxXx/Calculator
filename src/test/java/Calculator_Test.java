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

   @Test
    public void canDivide() {
        calculator.add(100);
        calculator.divide(4);
        assertEquals(25, calculator.getResult());
   }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        calculator.divide(0);
    }

    @Test
    public void divideByZeroDoesNotChangeResult() {
        calculator.add(2);

        try {
            calculator.divide(0);
        } catch (ArithmeticException a) {}

        assertEquals(2, calculator.getResult());
    }

    @Test
    public void canHandleMultipleOperations() {
        calculator.add(1000);
        calculator.subtract(100);
        calculator.multiply(5);
        calculator.divide(4);
        calculator.add(100);
        calculator.subtract(10);
        calculator.multiply(10);
        calculator.divide(2);
        assertEquals(6075, calculator.getResult());
    }

    @Test
    public void canAdd4To1AndGet5() {
        calculator.add(4);
        calculator.add(1);
        assertEquals(5, calculator.getResult());
    }

}
