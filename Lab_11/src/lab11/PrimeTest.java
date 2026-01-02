package lab11;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testPrimeNumber() {
        assertTrue(obj.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(obj.isPrime(9));
    }
}
