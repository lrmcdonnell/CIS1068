public class PrimeStuff {

    public static void main(String[] args) {
        System.out.println(isPrime(4));

    }
    //Check if prime
    public static boolean isPrime1(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPrime(int n) {
        return numFactors(n) == 2;
    }
    public static int numFactors(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (isFactor(i, n)) {
                factors++;
            }
        }
        return(factors);
    }
    public static boolean isFactor(int i, int n) {
        return i % n == 0;
    }
}
