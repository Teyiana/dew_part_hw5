
public class IterativeProgramming {
    public static void main(String[] args) {
        IterativeProgramming app = new IterativeProgramming();
        int n = 6;
        long result = app.getFibonacciValue(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    public  int getFibonacciValue(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }

        int n0 = 0;
        int n1 = 1;
      for(int i = 2; i <= n; i ++){
          int  result = n0 + n1;
          n0 = n1;
          n1 = result;
        }
       return n1;
    }
}
