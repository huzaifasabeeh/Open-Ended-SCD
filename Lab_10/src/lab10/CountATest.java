package lab10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountATest {

    @Test
    public void testCountA() {
        JUnitTesting obj = new JUnitTesting();
        assertEquals(6, obj.countA("Apple And Banana"));
    }
}
