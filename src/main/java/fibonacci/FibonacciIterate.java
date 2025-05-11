package fibonacci;

public class FibonacciIterate implements Fibonacci {
    @Override
    public long calculate(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long curr = 1;

        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
}
