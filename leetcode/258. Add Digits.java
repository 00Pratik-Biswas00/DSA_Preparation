class addBinary {
  public int addDigits(int num) {
    while (num >= 10) {
      int sum = 0;
      String numStr = String.valueOf(num);
      for (char ch : numStr.toCharArray()) {
        sum += ch - '0';
      }
      num = sum;
    }
    return num;
  }

  public static void main(String[] args) {
    addBinary solution = new addBinary();

    int num1 = 38;
    System.out.println(solution.addDigits(num1)); // Output: 2

    int num2 = 0;
    System.out.println(solution.addDigits(num2)); // Output: 0
  }
}
