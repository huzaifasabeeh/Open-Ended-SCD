package lab10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayOperationsTest {

    @Test
    public void testFindMax() {
        ArrayOperations obj = new ArrayOperations();
        int[] arr = {10, 25, 5, 40, 15};
        assertEquals(40, obj.findMax(arr));
    }

    @Test
    public void testFindMin() {
        ArrayOperations obj = new ArrayOperations();
        int[] arr = {10, 25, 5, 40, 15};
        assertEquals(5, obj.findMin(arr));
    }
}
