package fibonacci;

public class FibonacciRecursive implements Fibonacci {
    @Override
    public long calculate(int n) {

        if (n <= 1) {
            return n;
        }

        return calculate(n - 1) + calculate(n - 2);
    }
}
