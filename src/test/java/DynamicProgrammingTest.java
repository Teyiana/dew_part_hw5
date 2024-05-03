import org.junit.Assert;
import org.junit.Test;


public class DynamicProgrammingTest {
    private DynamicProgramming dynamic = new DynamicProgramming();

    @Test
    public void getFibonacciValueTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(dynamic.getFibonacciValue(i));
        }
    }

    @Test
    public void getFibonacciValueWorksDoesNotCorrectTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> dynamic.getFibonacciValue(-1));
    }

}
