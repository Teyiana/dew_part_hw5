
public class RecursiveProgramming {

    public static void main(String[] args) {
        RecursiveProgramming app = new RecursiveProgramming();
        int n = 6;
        long result = app.getFibonacciValue(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    public static long getFibonacciValue(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }

        return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
    }
}
