class MaxNestingDepthOfParenthesis {
  public static int maxDepth(String s) {
    int ct = 0, maxct = 0;
    for (char c : s.toCharArray()) {
      if (c == '(')
        ct++;
      else if (c == ')')
        ct--;

      if (maxct < ct)
        maxct = ct;
    }
    return maxct;
  }

  public static void main(String[] args) {
    System.out.println(maxDepth("(1)+((2))+(((3)))"));
  }
}
