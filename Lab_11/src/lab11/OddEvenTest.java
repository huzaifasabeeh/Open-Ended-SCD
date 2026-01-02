package lab11;

import static org.junit.Assert.*;
import org.junit.Test;

public class OddEvenTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testOddNumber() {
        assertTrue(obj.isOdd(5));
    }

    @Test
    public void testEvenNumber() {
        assertTrue(obj.isEven(10));
    }
}
