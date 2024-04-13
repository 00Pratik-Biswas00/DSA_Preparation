
class countPrime {

  public int countPrimes(int n) {
    if (n <= 1) {
      return 0;
    }

    // Create a boolean array to track prime status for numbers up to n-1
    boolean[] isPrime = new boolean[n];
    for (int i = 0; i < isPrime.length; i++)
      isPrime[i] = true;
    isPrime[0] = false; // 0 is not a prime number
    isPrime[1] = false; // 1 is not a prime number

    // Use the Sieve of Eratosthenes algorithm to mark non-prime numbers
    for (int i = 2; i * i < n; i++) {
      if (isPrime[i]) {
        // Mark all multiples of i as non-prime
        for (int j = i * i; j < n; j += i) {
          isPrime[j] = false;
        }
      }
    }

    // Count the number of primes less than n
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime[i]) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    countPrime sol = new countPrime();
    System.out.println(sol.countPrimes(10));

  }
}