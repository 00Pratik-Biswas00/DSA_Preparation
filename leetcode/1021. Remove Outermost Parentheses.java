class RemoveOutermostParentheses {
  public static String removeOuterParentheses(String s) {
    int ct = 0;
    StringBuilder sb = new StringBuilder();
    boolean add = false;
    for (char c : s.toCharArray()) {
      if (c == '(')
        ct++;
      else if (c == ')')
        ct--;

      if (c == '(' && ct == 2)
        add = true;
      else if (c == ')' && ct == 0)
        add = false;

      if (add)
        sb.append(c);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(removeOuterParentheses("(()())(())"));
  }
}
