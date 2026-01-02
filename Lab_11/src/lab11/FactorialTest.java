package lab11;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testFactorial() {
        assertEquals(120, obj.factorial(5));
    }
}
