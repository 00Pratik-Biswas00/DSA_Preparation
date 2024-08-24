class SumOfAllSubstrings {
  public static int beautySum(String s) {
    int ans = 0;
    for (int i = 3; i <= s.length(); i++) {
      int j = 0;
      int k = i;
      int[] freq = new int[26];
      for (int p = j; p < k; p++) {
        freq[s.charAt(p) - 'a']++;
      }
      ans += beauty(freq);
      while (k < s.length()) {
        freq[s.charAt(k) - 'a']++;
        freq[s.charAt(j) - 'a']--;
        ans += beauty(freq);
        k++;
        j++;
      }
    }
    return ans;
  }

  private static int beauty(int[] freq) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i : freq) {
      if (i != 0) {
        min = Math.min(min, i);
        max = Math.max(max, i);
      }
    }

    return max - min;
  }

  public static void main(String[] args) {
    System.out.println(beautySum("aabcb"));
  }
}
