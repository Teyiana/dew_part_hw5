import org.junit.Assert;
import org.junit.Test;

public class RecursiveProgrammingTest {
    private RecursiveProgramming recursive = new RecursiveProgramming();

    @Test
    public void getFibonacciValueTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(recursive.getFibonacciValue(i));
        }
    }

    @Test
    public void getFibonacciValueWorksDoesNotCorrectTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> recursive.getFibonacciValue(-1));
    }

}
