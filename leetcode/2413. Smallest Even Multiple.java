class SmallestEvenMultiple {
  public static int smallestEvenMultiple(int n) {
    if (n % 2 == 0) {
      // If n is even, return n
      return n;
    } else {
      // If n is odd, return 2 times n
      return 2 * n;
    }
  }

  public static void main(String[] args) {
    // Test cases
    System.out.println(smallestEvenMultiple(5)); // Output: 10
  }
}
