import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply(){
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void testDivide(){
        assertEquals(2.0, calculator.divide(5.0, 2.5), 0.0);
    }

}
