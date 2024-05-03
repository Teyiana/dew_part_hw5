import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IterativeProgrammingTest {
    private IterativeProgramming iterative = new IterativeProgramming();

    private final long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

    @Test
    public void getFibonacciValueTest() {
        for (int i = 0; i < expected.length; i++) {
            long result = iterative.getFibonacciValue(i);
            assertEquals(expected[i], result);
            System.out.println(result);
        }
    }

    @Test
    public void getFibonacciValueWorksDoesNotCorrectTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> iterative.getFibonacciValue(-1));
    }
}
