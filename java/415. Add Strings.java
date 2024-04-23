class AddStrings {
  public static String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
      int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
      int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
      int sum = digit1 + digit2 + carry;

      sb.append(sum % 10); // Append the current digit to the result
      carry = sum / 10; // Update the carry for the next iteration

      i--; // Move to the next digit in num1
      j--; // Move to the next digit in num2
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(addStrings("123", "11"));
  }
}
