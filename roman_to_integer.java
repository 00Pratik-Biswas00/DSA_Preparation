import java.util.*;

class Solution {

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

  public static int romanToInt(String s) {
    int res = 0;
    for (char ch = 0; ch < s.length(); ch++) {
      char currChar = s.charAt(ch);
      int currValue = getValue(currChar);

      if (ch < s.length() - 1) {
        char nextChar = s.charAt(ch + 1);
        int nextValue = getValue(nextChar);
        if (currValue < nextValue)
          res -= currValue;
        else
          res += currValue;
      } else
        res += currValue;

    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase();
    System.out.println(romanToInt(s));
  }
}