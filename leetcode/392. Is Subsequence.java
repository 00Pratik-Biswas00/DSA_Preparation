class Subsequence {

  public static boolean isSubsequence(String s, String t) {
    int sIndex = 0, tIndex = 0;

    // Loop through both strings
    while (sIndex < s.length() && tIndex < t.length()) {
      // If characters match, move sIndex
      if (s.charAt(sIndex) == t.charAt(tIndex)) {
        sIndex++;
      }
      // Always move tIndex
      tIndex++;
    }

    // If sIndex has reached the end of s, then s is a subsequence of t
    return sIndex == s.length();
  }

  public static void main(String[] args) {
    String s1 = "abc";
    String t1 = "ahbgdc";
    System.out.println(isSubsequence(s1, t1));

  }
}
