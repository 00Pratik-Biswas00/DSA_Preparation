class sqrt {
  public static int mySqrt(int x) {
    // Heron's method
    double guess = x / 2;
    double epsilon = 1e-6;
    if (x == 1)
      guess = 1;
    while (guess * guess - x > epsilon) {
      guess = (guess + x / guess) / 2;
    }
    int value = (int) guess;
    return value;
  }

  public static void main(String[] args) {
    System.out.println(mySqrt(2147395599));
  }
}
