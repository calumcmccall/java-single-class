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

}
