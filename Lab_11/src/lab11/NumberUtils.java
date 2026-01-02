package lab11;

public class NumberUtils {

    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int factorial(int n) {
        if (n < 0)
            return -1;

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
