class PowerOf2 {
  // Bit Manipulation Method:
  // An integer n is a power of two if and only if n is positive (n > 0) and has
  // exactly one bit set in its binary representation. This means n must be of the
  // form 2^x for some non-negative integer x.
  // Using bit manipulation, we can check if n is a power of two by examining its
  // binary representation. Specifically, for a number n:
  // If n is positive (n > 0) and (n & (n - 1)) == 0, then n is a power of two.
  // This condition works because a power of two in binary representation has only
  // one bit set (e.g., 1000 for 8).

  public static boolean isPerfectSquare(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    System.out.println(1 / 4);
    System.out.println(isPerfectSquare(16));
  }
}
