class perfectNumber {

  public boolean checkPerfectNumber(int num) {
    if (num <= 1) {
      return false;
    }

    int sum = 1; // Start with 1 since 1 is a proper divisor for all positive integers

    // Check for divisors up to sqrt(num)
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        sum += i; // Add i as a divisor
        if (i != num / i) {
          sum += num / i; // Add num/i as a divisor (if different from i)
        }
      }
    }

    // Check if sum of proper divisors equals num
    return sum == num;
  }

  public static void main(String[] args) {
    perfectNumber perfect_Number = new perfectNumber();

    int num1 = 28;
    System.out.println(perfect_Number.checkPerfectNumber(num1)); // Output: true

    int num2 = 7;
    System.out.println(perfect_Number.checkPerfectNumber(num2)); // Output: false
  }

}
