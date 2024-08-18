class KSubstringI {
  public static int countSubstrings(String s, int k) {
    int n = s.length();
    int left = 0, count0 = 0, count1 = 0, result = 0;

    for (int right = 0; right < n; right++) {
      if (s.charAt(right) == '0')
        count0++;
      else
        count1++;

      while (count0 > k && count1 > k) {
        if (s.charAt(left) == '0')
          count0--;
        else
          count1--;
        left++;
      }
      result += (right - left + 1);
    }

    return result;
  }

  public static void main(String[] args) {
    String s1 = "10101";
    int k1 = 1;
    System.out.println(countSubstrings(s1, k1)); // Output: 12

  }
}
