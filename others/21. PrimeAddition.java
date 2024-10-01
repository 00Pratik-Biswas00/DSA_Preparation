import java.util.Scanner;

class TATA {

  public static boolean prime(int n) {
    if (n <= 1)
      return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0)
        return false;
    }

    return true;
  }

  public static boolean isPrime(int n) {
    // Check for all numbers less than n
    for (int i = 2; i <= n / 2; i++) {
      int complement = n - i;
      if (prime(i) && prime(complement)) {
        System.out.println(n + " can be expressed as " + i + " + " + complement);
        return true; // Found a valid pair
      }
    }
    return false; // No valid pair found
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();

    System.out.println(isPrime(l));

    sc.close();

  }
}