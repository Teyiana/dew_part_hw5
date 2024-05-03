import org.junit.Assert;
import org.junit.Test;


public class IterativeProgrammingTest {
    private IterativeProgramming iterative = new IterativeProgramming();

    @Test
    public void getFibonacciValueTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(iterative.getFibonacciValue(i));
        }
    }

    @Test
    public void getFibonacciValueWorksDoesNotCorrectTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> iterative.getFibonacciValue(-1));
    }
}
