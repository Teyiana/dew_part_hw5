
import java.util.ArrayList;
import java.util.List;

public class DynamicProgramming {
    public static List<Long> fibonacciSubResults = new ArrayList<>();
    static {
        fibonacciSubResults.add(0L);
        fibonacciSubResults.add(1L);
    }

    public static void main(String[] args) {
        DynamicProgramming app = new DynamicProgramming();
        int n = 6;
        long result = app.getFibonacciValue(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

    }
    public long getFibonacciValue(int n){
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }

        if (fibonacciSubResults.size() > n) {
            return fibonacciSubResults.get(n);
        }
        long result = getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        fibonacciSubResults.add(n, result);
       return result;

    }
}
