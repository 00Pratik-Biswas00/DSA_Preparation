class RomanToInteger {

  public static int romanToInt(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      int currentValue = getValue(currentChar);

      // Check if subtractive notation is used
      if (i < s.length() - 1) {
        char nextChar = s.charAt(i + 1);
        int nextValue = getValue(nextChar);

        if (currentValue < nextValue) {
          // Subtract the current value (e.g., IV, IX, XL, XC, CD, CM)
          result -= currentValue;
        } else {
          // Add the current value
          result += currentValue;
        }
      } else {
        // Add the current value (last character in the string)
        result += currentValue;
      }
    }

    return result;
  }

  private static int getValue(char romanChar) {
    switch (romanChar) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {
    String romanNumeral = "MCMXCIV";
    int result = romanToInt(romanNumeral);

    System.out.println("Integer representation: " + result);
  }
}
